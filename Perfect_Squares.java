class Solution {
    int[] arr;
    public int numSquares(int n) {
        if (arr == null) {
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.MAX_VALUE;
            }
        }

        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            arr[n - 1] = 1;
            return 1;
        }

        int mini = Integer.MAX_VALUE;
        for (int i = 1; i * i < n; i++) {
            final int remain = n - i * i;
            mini = Math.min(mini, arr[remain - 1] != Integer.MAX_VALUE ?
                    1 + arr[remain - 1]:
                    1 + numSquares(remain));
        }

        arr[n - 1] = mini;
        return mini;
    }
}
