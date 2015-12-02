public class Solution {
    public int numTrees(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 1;
        for(int i = 0; i <= n; i++)
            for(int j = 0; j < i; j++)
                nums[i] += nums[j] * nums[i - 1 - j];
        return nums[n];
        
    }
}
