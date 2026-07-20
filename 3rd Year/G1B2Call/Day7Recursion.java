
// public class Day7Recursion {
//     public void addition(int a=9, int b) {// defaultParameter
//         int s = a + b;
//         System.out.println(s);
//     }
//     public static void main(String[] args) {
//         Day7Recursion fun = new Day7Recursion();
//         fun.addition(3, 4);
//         // addition(3, 5);  // CA
//         // for (int i = 91; i <= 100; i++) {
//         //     System.out.println("Shivam Bansal");
//         // }
//     }
// }
import java.util.ArrayList;
import java.util.Scanner;

public class Day7Recursion {

    public static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        printNto1(n - 1);
        System.out.println(n);
    }

    public static void learningCallStack(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("INSIDE BEFORE FN, n = " + n);
        printNto1(n - 1);
        System.out.println("INSIDE AFTER FN, n = " + n);

    }

    public static void print1toN(int i, int n) {

        if (i == n + 1) {
            return;
        }

        System.out.println(i);
        print1toN(i + 1, n);

    }

    public static int sumOfnNaturalNums(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n + sumOfnNaturalNums(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }

    public static void pORc(int n, int r, Scanner sc) {
        System.out.println("What do you want to implement: ");
        System.out.println("1. Permutation");
        System.out.println("2. Combination");
        int userInput = sc.nextInt();

        int permutation = factorial(n) / factorial(n - r);
        int combination = permutation / factorial(r);

        switch (userInput) {
            case 1 ->
                System.out.println("Permutation = " + permutation);
            case 2 ->
                System.out.println("Combination = " + combination);
            default ->
                System.out.println("Wrong Input");
        }
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {

        if (arr.size() <= 1) {
            return arr;
        }

        ArrayList<Integer> big = new ArrayList<>();
        ArrayList<Integer> small = new ArrayList<>();

        int pivot = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < pivot) {
                small.add(arr.get(i));
            } else {
                big.add(arr.get(i));
            }
        }

        small = quickSort(small);
        big = quickSort(big);

        ArrayList<Integer> res = new ArrayList<>();

        res.addAll(small);
        res.add(pivot);
        res.addAll(big);

        return res;
    }

    public static int countPaths(int i, int j, int n, int m) {

        // DeadEnd
        if (i == m || j == n) {
            return 0;
        }
        // Destination
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        // Move Down
        int downPaths = countPaths(i + 1, j, n, m);

        // Move Right
        int rightPaths = countPaths(i, j + 1, n, m);

        return downPaths + rightPaths;
    }

    public static void spiralMatrix(int[][] mat, int top, int left, int right, int bottom) {

        if (top > bottom || left > right) {
            return;
        }

        // Left to right
        for (int i = left; i <= right; i++) {
            System.out.print(mat[top][i] + " ");
        }

        // Top to bottom
        for (int i = top + 1; i <= bottom; i++) {
            System.out.print(mat[i][right] + " ");
        }

        // Right to Left
        for (int i = right - 1; i >= 0; i--) {
            System.out.print(mat[bottom][i] + " ");
        }

        // Bottom to Top
        for (int i = bottom - 1; i > 0; i--) {
            System.out.print(mat[i][left] + " ");
        }

        spiralMatrix(mat, top + 1, left + 1, right - 1, bottom - 1);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("CODE STARTS");
        // int n = 3;
        // // printNto1(n);
        // learningCallStack(n);
        // System.out.println("Learning Call Stack !");
        // int n = 5;
        // print1toN(1, n);
        // int n = 5;
        // int res = sumOfnNaturalNums(n);
        // System.out.println("Sum of " + n + "natural numbers = " + res);
        // System.out.println("Factorial: " + factorial(5));
        // int n = 5;
        // int r = 2;
        // pORc(n, r, sc);
        // ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(3, 44, 1, 64, 89, 2, 16, 9));
        // System.out.println(quickSort(arrList));
        // int n = 3;
        // int m = 3;
        // System.out.println(countPaths(0, 0, n, m));
        // int[][] mat = {
        //     {1, 2, 3, 4},
        //     {12, 13, 14, 5},
        //     {11, 16, 15, 6},
        //     {10, 9, 8, 7}
        // };
        int[][] mat = {
            {1, 2, 3},
            {8, 9, 4},
            {7, 6, 5}
        };

        int n = mat.length - 1;
        int m = mat[0].length - 1;

        spiralMatrix(mat, 0, 0, n, m);
    }

}
