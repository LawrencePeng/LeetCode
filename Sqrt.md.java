public class Solution {
    public int mySqrt(int x) {
        double i = 1;
        double time = 1000;
        while(time != 0)
            if(Math.abs(i * i - x) <= .00001)
                return (int)i;
            else 
                i = (i + (x / i)) / 2;
        return 0;
    }
}
