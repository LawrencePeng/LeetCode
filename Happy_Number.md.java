public class Solution {
    public boolean isHappy(int n) {
        for(int i = 0; i < 2000;i++) {
            int sum = 0;
            String s = n + "";
            for(char w : s.toCharArray())
                sum += Integer.parseInt("" + w) * Integer.parseInt("" + w);
            if(sum == 1)
                return true;
            else
                n = sum;
        }
        return false;
    }
}
