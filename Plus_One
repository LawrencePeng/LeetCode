public class Solution {
    public int[] plusOne(int[] digits) {
                int len = digits.length;
                for(int i = len - 1; i >= 0; i--) {
                    if(digits[i] == 9) {
                                        digits[i] = 0;
                                        if(i == 0) {
                                                                int[] tmp = new int[len + 1];
                                                                                    tmp[0] = 1;
                                                                                                        for(int j = 1; j <= len; j++)
                                                                                                                                    tmp[j] = digits[j - 1];
                                                                                                                            return tmp;

                                        }

                    } else {
                                         digits[i]++;
                                                         return digits;

                    }

                }
                        return digits;

    }

}
