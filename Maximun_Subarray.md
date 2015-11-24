public class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int now = nums[0];
        if(nums.length == 1)
            return sum;
        for(int i =1;i < nums.length;i++) {
            if(now >= 0)
                now += nums[i];
            else
                now = nums[i];
            if(now > sum)
                sum = now;
        }
        return sum;
    }
}
