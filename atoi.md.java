public class Solution {
    public int myAtoi(String str) {
        String Mystr = str.trim();
        if(Mystr.equals(""))
            return 0;
        if(Mystr.length() == 1) {
            int tmp = (int) Mystr.charAt(0);
            return tmp > '9' || tmp < '0' ? 0 :tmp - (int)'0';
        }
        char first = Mystr.charAt(0);
        char sec = Mystr.charAt(1);
        if(first == '+') {
            if(sec < '0' || sec > '9')
                return 0;
            else 
                return myAtoi(Mystr.substring(1));
        }
        else if(first == '-') {
            if(sec < '0' || sec > '9')
                return 0;
            else {
                double ans = (int)Mystr.charAt(1) - (int)'0';
                ans = - ans;
                for(int i = 2; i < Mystr.length(); i++)
                    if(Mystr.charAt(i) >= '0' && Mystr.charAt(i) <= '9') {
                        ans *= 10;
                        ans -= (int)Mystr.charAt(i) - (int)'0';
                    } else {
                        return (int)ans == ans ? (int)ans : -2147483648;
                    }
                return (int)ans == ans ? (int)ans : -2147483648;
            }
        } else if(first == '0') {
            int tmp = (int) Mystr.charAt(01);
            return tmp > '9' || tmp < '0' ? 0 : myAtoi(Mystr.substring(1));
        }
        else if(first < '0' || first > '9')
            return 0;
        else {
            double ans = (int)Mystr.charAt(0) - (int)'0';
            for(int i = 1; i < Mystr.length(); i++)
                if(Mystr.charAt(i) >= '0' && Mystr.charAt(i) <= '9') {
                    ans *= 10;
                    ans += (int)Mystr.charAt(i) - (int)'0';
                } else {
                    return (int)ans == ans ? (int)ans : 2147483647;
                }
            return (int)ans == ans ? (int)ans : 2147483647;
        }
    }
}
