public class Solution {
    public static boolean wordPattern(String pattern, String str) {
        if(Objects.equals(pattern, str) && Objects.equals(str, ""))
            return true;
        String[] arr = str.split(" ");
        if(pattern.length() != arr.length)
            return false;
        HashMap<Character,String> map = new HashMap<>();
        for(int i = 0; i < arr.length;i ++) {
            char si = pattern.charAt(i);
            String ti = arr[i];
            if(map.containsKey(si)) {
                if(!Objects.equals(map.get(si), ti))
                    return false;
            }
            else {
                map.put(si, ti);
            }
        }
        Iterator<Map.Entry<Character, String>> iterator = map.entrySet().iterator();
        HashSet<String> set = new HashSet<>();
        while (iterator.hasNext()) {
            Map.Entry<Character, String> next = iterator.next();
            if(set.contains(next.getValue()))
                return false;
            else
                set.add(next.getValue());
        }
        return true;
    }
}
