public class Solution {
    public int longestPalindrome(String s) {
        int[] bitset = new int[128];

        for (int i = 0; i < s.length(); i++) {
            bitset[s.charAt(i)]++;
        }

        int sum = 0;
        boolean isAllDual = true;
        for (int i = 0; i < 128; i++) {
            if (bitset[i] % 2 == 1) isAllDual = false;
            sum += (bitset[i] / 2) * 2;
        }

        return isAllDual ? sum : sum + 1;
    }
}
