class Solution {
    public:
        vector<vector<int>> generate(int numRows) {
                    vector<vector<int> > vec(numRows);

                    for(int i = 0; i < numRows;i++) {
                        for(int j = 0; j <= i; j++) {
                                            vec[i].push_back(Pascal(vec, i, j));

                        }

                    }

                            return vec;

        }
    private:
        long double Pascal(vector<vector<int>> vec, int posI, int posJ) {
                     if(posI == 0 :call <SNR>116_align()
                             a| posI == posJ)
                                     return 1;
                             return vec[posI - 1][posJ] + vec[posI - 1][posJ - 1];
                                 }
            long double sum(int n) { return n <= 1 ? 1 : n * sum(n - 1);  }
};|)
        }
}
