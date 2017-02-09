public class Solution {
    public int islandPerimeter(int[][] grid) {
        int onesCount = 0;
        int inter = 0;
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    onesCount++;
                    if (i != 0) {
                        inter += grid[i - 1][j];
                    }
                    if (i != row - 1) {
                        inter += grid[i + 1][j];
                    }
                    if (j != 0) {
                        inter += grid[i][j - 1];
                    }
                    if (j != col - 1) {
                        inter += grid[i][j + 1];
                    }
                }
            }
        }
        return 4 * onesCount - inter;
    }
}
