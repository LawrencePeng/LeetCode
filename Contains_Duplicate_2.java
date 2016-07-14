public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        if (len == 0 || k == 0) return false;
        for (int i = len - k; i >= 0; i--) {
            int space = k - 1;
            while (space != 0) {
                if (nums[i + space--] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
