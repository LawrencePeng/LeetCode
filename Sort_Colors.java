public class Solution {
    public void sortColors(int[] nums) {
        int r = 0;
        int b = 0;
        int w = 0;

        for (int num : nums) {
            if (num == 0) {
                r++;
            } else if (num == 1) {
                w++;
            } else {
                b++;
            }
        }

        int index = 0;
        while(index != nums.length) {
            if (r != 0) {
                r--;
                nums[index++] = 0;
            } else if (w != 0) {
                w--;
                nums[index++] = 1;
            } else {
                nums[index++] = 2;
            }
        }
    }
}
