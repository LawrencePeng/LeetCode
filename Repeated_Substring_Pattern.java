public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        String tmp = str + str;
        return tmp.substring(1, tmp.length() - 1).indexOf(str) != -1;
    }
}
