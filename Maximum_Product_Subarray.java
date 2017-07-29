public class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int[] minDP = new int[len];
        int[] maxDP = new int[len];

        minDP[0] = nums[0];
        maxDP[0] = nums[0];

        for (int i = 1; i < len; i++) {
            minDP[i] = Integer.min(nums[i], (nums[i] >= 0 ? minDP[i - 1] : maxDP[i - 1]) * nums[i]);
            maxDP[i] = Integer.max(nums[i], (nums[i] >= 0 ? maxDP[i - 1] : minDP[i - 1]) * nums[i]);
        }

        int gmax = minDP[0];
        for (int i = 1; i < len; i++) {
            gmax = Integer.max(gmax, maxDP[i]);
        }
        return gmax;
    }
}
