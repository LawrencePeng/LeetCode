public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 10;
        int product = 9;

        for (int i = 9; i >= 9 - n + 2; i--) {
            product *= i;
        }

        return countNumbersWithUniqueDigits(n - 1) + product;
    }
}
