public class Solution {
public int climbStairs(int n) {
    int[] a = {1,2};
    for(int i = 2; i < n; i++){
        a[i%2] = a[(i-1)%2] + a[(i-2)%2];
    }
    return a[(n-1)%2];
}
}
