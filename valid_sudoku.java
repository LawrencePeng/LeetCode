public class Solution {
    public boolean isValidSudoku(char[][] board) {
        final int row = board.length;
        final int col = board[0].length;
        if (row != 9 || col != 9) return false;

        for (int i = 0; i < row; i++) {
            HashSet<Character> hs = new HashSet<>();

            for (int j = 0; j < col; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                if (board[i][j] > '9' || board[i][j] < '0') {
                    return false;
                }

                if (hs.contains(board[i][j])) {
                    return false;
                }

                hs.add(board[i][j]);
            }
        }

        for (int j = 0; j < col; j++) {
            HashSet<Character> hs = new HashSet<>();
            for (int i = 0; i < row; i++) {
                if (board[i][j] == '.') {
                    continue;
                }

                if (board[i][j] > '9' || board[i][j] < '1') {
                    return false;
                }

                if (hs.contains(board[i][j])) {
                    return false;
                }

                hs.add(board[i][j]);
            }
        }

        for (int i = 0; i <= 6; i += 3) {
            for (int j = 0; j <= 6; j += 3) {
                HashSet<Character> hs = new HashSet<>();
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (board[k][l] == '.') {
                            continue;
                        }

                        if (board[k][l] > '9' || board[k][l] < '1') {
                            return false;
                        }

                        if (hs.contains(board[k][l])) {
                            return false;
                        }

                        hs.add(board[k][l]);
                    }
                }
            }
        }

        return true;
    }
}
