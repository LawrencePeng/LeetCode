class Solution {
public:
    int maximalSquare(vector<vector<char>>& matrix) {
        if (matrix.empty()) return 0;
        int m = matrix.size(), n = matrix[0].size();
        vector<int> dp(m + 1, 0);
        int maxsize = 0, pre = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 1; i <= m; i++) {
                int temp = dp[i];
                if (matrix[i - 1][j] == '1') {
                    dp[i] = min(dp[i], min(dp[i - 1], pre)) + 1;
                    maxsize = max(maxsize, dp[i]);
                }
                else dp[i] = 0;
                pre = temp;
            }
        }
        return maxsize * maxsize;
    }
};
