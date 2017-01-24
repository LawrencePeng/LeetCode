public class Solution {
    public int totalHammingDistance(int[] nums) {
        int[] eachBits = new int[31];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 31; j++) {
                if (((1 << j) & nums[i]) != 0) {
                    eachBits[j]++;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 31; i++) {
            sum += eachBits[i] * (nums.length - eachBits[i]);
        }
        return sum;
    }
}
