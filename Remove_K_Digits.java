public class Solution {
    public static String removeKdigits(String num, int k) {
        int len = num.length();
        if (len <= k) {
            return "0";
        }

        while(k != 0) {
            k--;
            boolean isKilled = false;
            for (int i = 0; i < num.length() - 1; i++) {
                if (num.charAt(i) > num.charAt(i + 1)) {
                    num = num.substring(0, i) + num.substring(i + 1);
                    isKilled = true;
                    break;
                }
            }
            if (!isKilled) {
                num = num.substring(0, num.length() - 1);
            }
        }
        int numOfZero = 0;
        int index = 0;
        while (index != num.length() && num.charAt(index++) == '0') numOfZero++;
        return num.substring(numOfZero).equals("") ? "0" : num.substring(numOfZero);
    }
}
