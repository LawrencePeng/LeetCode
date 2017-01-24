public class Solution {
    int[] original;
    int len;
    int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
        len = nums.length;
        original = new int[len];
        for (int i = 0; i < len; i++) original[i] = nums[i];
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        for (int i = 0; i < len; i++) {
            nums[i] = original[i];
        }
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random rand = new Random();
        for (int i = 0; i < len; i++) {
            swap(nums, i, rand.nextInt(len));
        }
        return nums;
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
