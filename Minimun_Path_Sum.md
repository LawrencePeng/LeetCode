It's out of time.But i love it.

public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return helper(grid,m,n,grid[0][0],0,0);
    }
    int helper(int[][] grid,int m,int n,int sum,int nowM,int nowN) {
        if(nowM == m - 1 && nowN == n - 1)
            return sum;
        if(nowM == m - 1)
            return helper(grid,m,n,sum + grid[nowM][nowN + 1],nowM,nowN + 1);
        if(nowN == n - 1)
            return helper(grid,m,n,sum + grid[nowM + 1][nowN],nowM + 1,nowN);
        return Math.min(
            helper(grid,m,n,sum + grid[nowM][nowN + 1],nowM,nowN + 1),
            helper(grid,m,n,sum + grid[nowM + 1][nowN],nowM + 1,nowN)
            );
    }
}
