
public class NQueens {

    static int N = 4;

    static boolean isSafe(char[][] board, int row, int col) {

        // Check upper column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
                i >= 0 && j >= 0;
                i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
                i >= 0 && j < N;
                i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static boolean solve(char[][] board, int row) {

        if (row == N) {
            return true; // solution found
        }

        for (int col = 0; col < N; col++) {

            if (isSafe(board, row, col)) {

                System.out.println("Yes");
            } else {
                System.out.println("No");

            }
        }

        return false;
    }

    public static void main(String[] args) {

        char[][] board = new char[N][N];

        // for (int i = 0; i < N; i++) {
        //     java.util.Arrays.fill(board[i], '.');
        // }
        solve(board, 0);

        // if (solve(board, 0)) {
        //     for (char[] row : board) {
        //         System.out.println(new String(row));
        //     }
        // } else {
        //     System.out.println("No solution");
        // }
    }
}
