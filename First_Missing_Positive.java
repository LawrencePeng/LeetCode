public class Solution {
    public int firstMissingPositive(int[] nums) {
        BitSet bitSet = new BitSet();
        for (int n : nums) {
            if (n > 0 && n <= nums.length)
                bitSet.set(n);
        }

        for (int i = 1; i < nums.length + 1; i++) {
            if (!bitSet.get(i)) {
                return i;
            }
        }
        return nums.length + 1;
    }
}
