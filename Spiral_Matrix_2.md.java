public class Solution {
    public int[][] generateMatrix(int n) {
        if(n == 0) return new int[n][n];
        if(n == 1) {
            int[][] ans = new int[n][n];
            ans[0][0] = 1;
            return ans;
        }
        if(n == 3) {
            
        }
        boolean[] direction = {true,false,false,false};
        int[][] ans = new int[n][n];
        for(int i = 0;i < n;i++)
            for(int j = 0;j < n;j++)
                ans[i][j] = 0;
        ans[0][0] = 1;
        int ip = 0,jp = 0,count = 1;
        while(count != n * n) {
            if(ip == 0 && jp == n - 1) {
                direction[0] = false;
                direction[1] = true;
            }
            if(ip == n - 1 && jp == n - 1) {
                direction[1] = false;
                direction[2] = true;
            }
            if(ip == n - 1 & jp == 0) {
                direction[2] = false;
                direction[3] = true;
            }
            if(ans[ip + b2l(direction[1]) - b2l(direction[3])][jp + b2l(direction[0]) - b2l(direction[2])] != 0)
                for(int i = 0;i < 4;i++)
                    if(direction[i] == true) {
                        direction[i] = false;
                        direction[(i + 1) % 4] = true;
                        break;
                    }
            ip += b2l(direction[1]) - b2l(direction[3]);
            jp += b2l(direction[0]) - b2l(direction[2]);
            ans[ip][jp] = count + 1;
            count++;
        }
        return ans;
    }
    int b2l(boolean b) {
        return b ? 1 : 0;
    }
}
