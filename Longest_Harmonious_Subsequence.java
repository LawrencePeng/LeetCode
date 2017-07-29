public class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxLen = 0;
        for (int num : nums) {
            int pre = map.getOrDefault(num - 1, -1);
            if (pre > 0) {
                int now = map.getOrDefault(num, -1);
                maxLen = Math.max(maxLen, pre + now);
            }
        }
        return maxLen;
    }
}
