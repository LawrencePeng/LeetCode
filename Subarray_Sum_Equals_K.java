public class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ret = 0;
        for (int i = 0, len = nums.length; i < len; i++) {
            sum += nums[i];
            int subK = sum - k;
            ret += map.getOrDefault(subK, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ret;
    }
}
