public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        n--;
        while (n != 0) {
            n--;
            s = countAndSay(s);
        }

        return s;
    }

    private String countAndSay(String s) {
        int head = 0;
        int tail = 1;

        int len = s.length();

        String ret = "";
        int count = 1;
        char c = s.charAt(0);
        while (tail != len) {
            if (s.charAt(head) != s.charAt(tail)) {
                ret += count;
                ret += c;
                head = tail;
                c = s.charAt(head);
                count = 1;
            } else {
                count++;
            }
            tail++;
        }

        ret += count;
        ret += c;
        return ret;
    }

}
