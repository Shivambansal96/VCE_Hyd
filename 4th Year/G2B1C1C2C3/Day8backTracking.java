
public class Day8backTracking {

    public static int countTotalPaths(int i, int j, int n, int m) {

        // Reached End (2,2)
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        //Dead End
        if (i == n || m == j) {
            return 0;
        }

        int rightPath = countTotalPaths(i, j + 1, n, m);
        int downPath = countTotalPaths(i + 1, j, n, m);

        return rightPath + downPath;
    }

    public static void spiralMatrix(int[][] mat, int left, int top, int right, int bottom) {

        if (left > right || top > bottom) {
            return;
        }

        // Left to Right
        for (int i = left; i <= right; i++) {
            System.out.print(mat[top][i] + " ");
        }

        // Top to Bottom
        for (int i = top + 1; i <= bottom; i++) {
            System.out.print(mat[i][right] + " ");
        }

        // Right to Left
        for (int i = right - 1; i >= left; i--) {
            System.out.print(mat[bottom][i] + " ");
        }

        // Bottom to Top
        for (int i = bottom - 1; i > top; i--) {
            System.out.print(mat[i][left] + " ");
        }

        spiralMatrix(mat, left + 1, top + 1, right - 1, bottom - 1);

    }

    public static void adaptiveCoolingCorridorAnalyzer(int[] arr, int k) {

        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int max = arr[i];

            for (int j = i; j < arr.length; j++) {
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);

                if (max - min <= k) {
                    int window = j - i + 1;
                    maxLength = Math.max(maxLength, window);
                } else {
                    break;
                }
            }
        }
        System.out.println("Longest Corridor = " + maxLength);

    }

    public static void main(String[] args) {
// ================= COUNT TOTal paths in a maZe ========================

        // int n = 4, m = 4;
        // int res = countTotalPaths(0, 0, n, m);
        // System.out.println(res);
// // ================= Spiral Matrix ========================
//         int[][] mat = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16}
//         };
//         int n = mat.length - 1;
//         int m = mat[0].length - 1;
//         spiralMatrix(mat, 0, 0, n, m);
        int[] arr = {10, 12, 15, 11, 14, 18, 19, 13};
        // int[] arr = {617883625};
        int k = 4;

        adaptiveCoolingCorridorAnalyzer(arr, k);

    }
}
