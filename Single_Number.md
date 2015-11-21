c class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        int result = 0;
        for(int i =0;i < len;i++)
            result ^= nums[i];
        return result;
    }
}
