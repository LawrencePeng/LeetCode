public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int left = j != 0 ? dp[i][j - 1] : Integer.MAX_VALUE;
                int up = i != 0 ? dp[i - 1][j] : Integer.MAX_VALUE;

                dp[i][j] = Math.min(left, up) + grid[i][j];
            }
        }

        return dp[m - 1][n - 1];
    }
}
