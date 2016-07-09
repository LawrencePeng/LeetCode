public class Solution {
    int res = 0;
    int[] A;
    public int totalNQueens(int n) {
        A = new int[n];
        nqueen(0,n);
        return res;
    }
    void nqueen(int cur,int n){ 
        if(cur == n) {
            res++;
            return;
        }
        else
            for(int i =0;i < n; i++) {
               A[cur] = i;
               if(valid(cur))
                    nqueen(cur + 1,n);
            }
    }
    boolean valid(int r) {
        for(int i =0;i < r;i++)
            if(A[i] == A[r] || Math.abs(A[i] - A[r]) == r-i)
                return false;
        return true;
    }
}
