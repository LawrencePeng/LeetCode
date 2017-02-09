public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        final int len = A.length;
        int[] arr = new int[len];
        int sum = 0;
        for (int i = 2; i < len; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                arr[i] = arr[i - 1] + 1;
                sum += arr[i];
            }
        }
        return sum;
    }
}
