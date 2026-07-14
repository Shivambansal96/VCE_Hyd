
public class Day8Recursion {

    public static void spiralMatrix(int[][] mat, int left, int right, int top, int bottom) {

        if (top > bottom || left > right) {
            return;
        }

        // Upper Row
        for (int i = left; i <= right; i++) {
            System.out.print(mat[top][i] + " ");
        }

        // Right Corner
        for (int i = top + 1; i <= bottom; i++) {
            System.out.print(mat[i][right] + " ");
        }

        // Bottom Row
        for (int i = right - 1; i >= left; i--) {
            System.out.print(mat[bottom][i] + " ");
        }

        // Left Corner
        for (int i = bottom - 1; i > top; i--) {
            System.out.print(mat[i][left] + " ");
        }

        spiralMatrix(mat, left + 1, right - 1, top + 1, bottom - 1);

    }

    public static void main(String[] args) {

        int[][] mat = {
            {1, 2, 3, 5},
            {8, 9, 4, 65},
            {7, 6, 5, 11},
            {87, 56, 15, 110}
        };
 
        int n = mat.length - 1;
        int m = mat[0].length - 1;

        spiralMatrix(mat, 0, n, 0, m);

    }
}
