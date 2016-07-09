public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        if (s.equals("")) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        while (left < right) {
            if (!isAlphaNumeric(chars[left])) {
                left++;
                continue;
            }
            if (!isAlphaNumeric(chars[right])) {
                right--;
                continue;
            }

            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char ch) { return (ch >= 'a' && ch <= 'z')
                                                || (ch >= 'A' && ch <= 'Z')
                                                || (ch >= '0' && ch <= '9'); }
}
