public class Solution {
    public void moveZeroes(int[] nums) {
        int ano = 0;
        int len = nums.length;
        for(int i = 0;i < len;i++)
            if(nums[i] != 0) {
                nums[ano] = nums[i];
                ano++;
            }
        for(int i = ano;i <len;i++)
            nums[i] = 0;
    }
}
