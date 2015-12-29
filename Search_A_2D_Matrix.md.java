public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int ip = -1;
        for(int i = 0; i < m; i++)
            if(target >= matrix[i][0])
                ip ++;
        if(ip == -1)
            return false;
        return bs(matrix,target,ip);
    }
    boolean bs(int[][] matrix,int target,int ip) {
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        while(left <= right) {
            int middle = (left + right) / 2;
            if(matrix[ip][middle] == target)
                return true;
            else if(matrix[ip][middle] > target)
                right = middle - 1;
            else
                left = middle + 1;
        }
        return false;
    }
}
