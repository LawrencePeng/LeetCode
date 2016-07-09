public class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if(len == 1)
            return nums[0];
        if(len == 2)
            return nums[1] > nums[0] ? nums[0] : nums[1];
        return findMin(nums,0,len - 1);
    }
    int findMin(int[] nums, int left, int right) {
        if(left > right)
            return 123456;
        int middle = (left + right) / 2;
        if(middle == 0)
            return Math.min(nums[0],findMin(nums,1,right));
        if(middle == nums.length - 1)
            return Math.min(nums[middle],findMin(nums,left,middle -1));
        if(nums[middle] < nums[middle - 1] && nums[middle] < nums[middle + 1])
            return nums[middle];
        return Math.min(findMin(nums, left, middle -1), findMin(nums, middle + 1, right));
    }
}
