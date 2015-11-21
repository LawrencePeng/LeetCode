public class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x : nums)
            if(h.containsKey(x))
                h.put(x,h.get(x) + 1);
            else
                h.put(x,1);
        Iterator<Map.Entry<Integer, Integer>> iterator = h.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            if(next.getValue() == 1){
                ans = next.getKey();
                break;
            }
        }
        return ans;
    }
}
