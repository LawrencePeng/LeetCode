public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int nowOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                nowOnes++;
            } else {
                if (nowOnes > maxOnes) {
                    maxOnes = nowOnes;
                }
                nowOnes = 0;
            }
        }
        return nowOnes > maxOnes ? nowOnes : maxOnes;
    }
}
