
import java.util.Scanner;

public class Day8Recursion {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void pORc() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select any one: ");
        System.out.println("1. Permutation");
        System.out.println("2. Combination");
        System.out.print("Press 1 or 2: ");

        int userInput = sc.nextInt();

        System.out.print("Enter n = ");
        int n = sc.nextInt();
        System.out.print("Enter r = ");
        int r = sc.nextInt();

        int num = factorial(n);
        int denom = factorial(n - r);
        int permutation = num / denom;

        denom = factorial(n - r) * factorial(r);
        int combination = num / denom;

        System.out.println(userInput == 1 ? "Permutation = " + permutation : "Combination = " + combination);

    }

    public static void mergeSort(int[] arr, int low, int high, int mid) {

        int[] res = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int idx = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                res[idx] = arr[i];
                idx++;
                i++;
            } else {
                res[idx] = arr[j];
                idx++;
                j++;
            }
        }

        while (i <= mid) {
            res[idx] = arr[i];
            idx++;
            i++;
        }

        while (j <= high) {
            res[idx] = arr[j];
            idx++;
            j++;
        }

        for (int k = 0; k < res.length; k++) {
            arr[low + k] = res[k];
        }
    }

    public static void merge(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        merge(arr, low, mid);
        merge(arr, mid + 1, high);
        mergeSort(arr, low, high, mid);

    }

    public static int countTotalPaths(int i, int j, int n, int m) {
        // DeadEnd
        if (i == n || j == m) {
            return 0;
        }

        // Destination
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Move Right
        int right = countTotalPaths(i, j + 1, n, m);

        // Move Down
        int down = countTotalPaths(i + 1, j, n, m);

        return right + down;

    }

    public static void spiralMatrix(int[][] mat, int top, int left, int right, int bottom) {

        if (top > bottom || left > right) {
            return;
        }

        // left to right
        for (int i = left; i <= right; i++) {
            System.out.print(mat[top][i] + " ");
        }

        // top to bottom
        for (int i = top + 1; i <= bottom; i++) {
            System.out.print(mat[i][right] + " ");
        }

        // right to left
        for (int i = right - 1; i >= left; i--) {
            System.out.print(mat[bottom][i] + " ");
        }

        // bottom to top
        for (int i = bottom - 1; i > top; i--) {
            System.out.print(mat[i][left] + " ");
        }

        spiralMatrix(mat, top + 1, left + 1, right - 1, bottom - 1);

    }

    public static void main(String[] args) {
        // int n = 5;
        // int res = factorial(n);
        // System.out.println("Factorial of " + n + " = " + res);
        // pORc();

        // // // ===== MERGE SORT ====
        // int[] arr = {2, 4, 1, 6, 7, 95, 43, 2, 1, 4};
        // merge(arr, 0, arr.length - 1);
        // for (int val : arr) {
        //     System.out.print(val + " ");
        // }
        // System.out.print(Arrays.toString(arr));
        // // // ===== COUNT TOTAL PATHS ====
        // int n = 4;
        // int m = 4;
        // System.out.println(countTotalPaths(0, 0, n, m));
        // // // ===== SPIRAL MATRIX ====
        int[][] mat = {{1, 2, 3, 4},
        {12, 13, 14, 5},
        {11, 16, 15, 6},
        {10, 9, 8, 7}};
        // int[][] mat = {{1, 2, 3, 4},
        // {5, 6, 7, 8},
        // {9, 10, 11, 12},
        // {16, 15, 14, 13}};

        spiralMatrix(mat, 0, 0, mat.length - 1, mat[0].length - 1);
    }
}
