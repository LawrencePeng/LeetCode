public class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int[][] result = new int[matrix.length][matrix.length];
        for(int i = 0;i < len;i ++)
            for(int j = 0;j < len;j ++)
                result[j][matrix.length - i - 1] = matrix[i][j];
        for(int i = 0;i < len;i ++)
            for(int j = 0;j < len;j ++)
                matrix[i][j] = result[i][j];
    }
    
}
