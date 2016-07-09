public class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
        double zi = m + n - 2;
        double t = zi;
        for(int i = 0;i < Math.min(n,m) - 2;i ++) {
            zi *= t - 1;
            t --;
        }
        return (int)(zi/fact(Math.min(n,m) - 1));
    }
    double fact(int n) {
        return n == 1 ? 1 : n * fact(n - 1);
    }
}
