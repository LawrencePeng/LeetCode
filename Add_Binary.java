public class Solution {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();

        int maxLen = Integer.max(m, n);
        for (int i = m; i < maxLen; i++) {
            a = "0" + a; // left pad
        }
        for (int i = n; i < maxLen; i++) {
            b = "0" + b; // left pad
        }

        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        String ret = "";
        int carry = 0;

        for (int i = 0; i < maxLen; i++) {
            int aInt = a.charAt(i) - '0';
            int bInt = b.charAt(i) - '0';

            ret += ((aInt + bInt + carry) % 2 == 1 ? "1" : "0");
            carry = aInt + bInt + carry >= 2 ? 1 : 0;
        }
        if (carry == 1) {
            ret += "1";
        }

        return new StringBuilder(ret).reverse().toString();
    }
}
