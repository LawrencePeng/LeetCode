public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] arr = new int[target + 1];
        arr[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i - num >= 0) {
                    arr[i] += arr[i - num];
                }
            }
        }
        return arr[target];
    }
}
