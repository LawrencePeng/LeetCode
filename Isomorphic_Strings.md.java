public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == t && s == "")
            return true;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0; i < s.length();i ++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            if(map.containsKey(si)) {
                if(map.get(si) != ti)
                    return false;
            }
            else {
                map.put(si,ti);
            }
        }
        HashMap<Character,Integer> bMap = new HashMap<>();
        Iterator<Map.Entry<Character, Character>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Character> next = iterator.next();
            if(bMap.containsKey(next.getValue()))
                return false;
            else
                bMap.put(next.getValue(),1);
        }
        return true;
    }
}
