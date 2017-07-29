public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int left = 0;
        int minSize = Integer.MAX_VALUE;
        for (int i = 0, len = nums.length; i < len; i++) {
            sum += nums[i];
            while (sum >= s) {
                minSize = Integer.min(minSize, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if (minSize == Integer.MAX_VALUE) {
            return 0;
        }
        return minSize;
    }
}
