public class Solution {
    boolean isZero = false;
    public int reverse(int x) {
        if(reverseHelper(reverseHelper(x)) != (double)x)
            if(isZero == true)
                if((x >= 0 && reverseHelper(x) < 0) || (x < 0) && reverseHelper(x) > 0)
                    return 0;
                else
                    return (int)reverseHelper(x);
            else
                return 0;
        double s= reverseHelper(x);
        int tmp = (int)s;
        if(s != tmp)
            return 0;
        if(x / reverseHelper(x) >= 10)
            return 0;
        return (int)reverseHelper(x);
        
    }
    public double reverseHelper(double x) {
        if(x < 10 && x >= 0)
            return x;
        if(x > 10 && x < 0)
            return x;
        double tmp = x >= 0 ? x : -x;
        
        double ans = tmp % 10;
        tmp -= tmp % 10;
        tmp /= 10;
        
        if(ans == 0) {
            isZero = true;
            return reverseHelper(x / 10);
        }
        while(tmp != 0) {
            ans *= 10;
            ans += tmp % 10;
            tmp -= tmp % 10;
            tmp /= 10;
        }
        
        return x >= 0 ? ans : -ans;
    }
}
