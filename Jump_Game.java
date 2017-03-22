public class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if (len == 0) return false;
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (index < i)
                return false;
            index = Math.max(index, nums[i] + i);
        }
        return true;
    }
}
