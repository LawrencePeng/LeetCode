public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0)
            return 0;
            int pos = nums.length + 1;
        if(nums.length == 1)
            return nums[0] >= target ? 0 : 1;
        for(int i =0; i < nums.length;i++) {
            if(target <= nums[i]) {
                pos = i;
                break;
            }
        }
        return pos == nums.length + 1 ? nums.length : pos;
    }
}
