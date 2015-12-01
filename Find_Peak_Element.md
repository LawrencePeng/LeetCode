public class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if(len == 1)
            return 0;
        if(len == 2)
            return nums[0] > nums[1] ? 0 : 1;
        if(nums[0] > nums[1])
            return 0;
        if(nums[len - 1] > nums[len - 2])
            return len - 1;
        return binary_search(nums, 0, len - 1);
    }
    int binary_search(int[] nums,int left,int right) {
        if(left > right)
            return -111111;
        int middle = (left + right) / 2;
        if(middle == 0)
            return binary_search(nums,1,right);
        if(middle  == nums.length - 1)
            return binary_search(nums,left,middle - 1);
        if(nums[middle] > nums[middle - 1] && nums[middle] > nums[middle + 1])
            return middle;
        return Math.max(binary_search(nums, left, middle - 1), binary_search(nums, middle + 1, right));
    }
}
