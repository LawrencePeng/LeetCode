public class Solution {
    public char findTheDifference(String s, String t) {
        char tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            tmp ^= s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            tmp ^= t.charAt(i);
        }

        return tmp;
    }
}
