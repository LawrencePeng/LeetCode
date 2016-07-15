public class Solution {
    public int lengthOfLastWord(String s) {
        boolean isBreak = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                isBreak =true;
                break;
            }
        }
        if (!isBreak) return 0;

        String[] arr = s.trim().split("\\b+");
        return arr[arr.length - 1].length();
    }
}
