public class Solution {
    public int missingNumber(int[] nums) {
        int total = nums.length * (nums.length + 1) /2;
        for(int num : nums)
            total -= num;
        return total;
    }
}
