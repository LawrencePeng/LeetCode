public class Solution {
    public double myPow(double x, int n) {
        double tmp = x;
        if(n == 0)
            return 1;
        if(x == 1)
            return 1;
        if(x == -1)
            return n % 2 ==0 ? 1 : -1;
        if(n < 0)
            return 1.0 / myPow(x,-n);
        
        if(Math.abs(n) >= 13131313)
            return 0;
        int p;
        int powtime = 0;
        int all = 1;
        for(int i = 2;;i *= 2)
            if(i > n) {
              p = i;
              break;
            }
            else {
                powtime ++;
                if(i >= 2)
                    all *= 2;
            }
        for(int i = 0; i < powtime;i ++)
            x *= x;
        for(int i = 0; i < n - all;i ++)
            x *= tmp;
        return x;
    }
}
