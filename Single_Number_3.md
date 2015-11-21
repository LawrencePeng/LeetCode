public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = nums[0];
        for(int i = 1;i < nums.length;i++)
            xor ^= nums[i];
        int lowbit = xor & -xor;
        int[] arr = {0,0};
        for(int x : nums) {
            int y = x & lowbit;
            if(y == 0)
                arr[0] ^= x;
            else
                arr[1] ^= x;
        }
        return arr;
    }
}
