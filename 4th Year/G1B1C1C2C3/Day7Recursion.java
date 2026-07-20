
import java.util.Arrays;
import java.util.Scanner;

public class Day7Recursion {

    public static int learningCallStack(int n) {

        if (n == 0) {
            return 0;
        }

        System.out.println("BEFORE I am INSIDE the function, = " + n);
        learningCallStack(n - 1);

        System.out.println("AFTER I am INSIDE the function, = " + n);

        return 0;
    }

    public static int printDescending(int n) {

        if (n == 0) {
            return 0;
        }

        System.out.println(n);
        return printDescending(n - 1);
    }

    public static int printAscending(int n, int i) {

        if (i == n + 1) {
            return 0;
        }

        System.out.println(i);
        return printAscending(n, i + 1);
    }

    public static int learningStack(int n) {

        if (n == 0) {
            return 0;
        }

        System.out.println("BEFORE I am INSIDE the function, = " + n);
        learningStack(n - 1);

        if (n != 1) {
            System.out.println("AFTER I am INSIDE the function, = " + n);
        }

        return 1;
    }

    public static int sumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sumOfNaturalNumbers(n - 1);
    }

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);

    }

    public static void permutation(int n, int r) {

        int num = factorial(n);
        int denom = factorial(n - r);
        System.out.println("Permutation = " + num / denom);

    }

    public static void combination(int n, int r) {

        int num = factorial(n);
        int denom = factorial(r) * factorial(n - r);
        System.out.println("Combination = " + num / denom);

    }

    public static void pORc() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        System.out.println("What do you want to perform ?");
        System.out.println("1. Permutation");
        System.out.println("2. Combination");
        int input = sc.nextInt();

        if (input == 1) {
            permutation(n, r);
        } else {
            combination(n, r);
        }
    }

    public static void mergeSort(int[] newArr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(newArr, left, mid);
        mergeSort(newArr, mid + 1, right);

        int[] arr = Arrays.copyOfRange(newArr, left, mid + 1);
        int[] arr2 = Arrays.copyOfRange(newArr, mid + 1, right + 1);
        int[] res = new int[arr.length + arr2.length];

        res = mergeSortedArrays(arr, arr2, res, arr.length, arr2.length);

        for (int i = 0; i < res.length; i++) {
            newArr[left + i] = res[i];
        }
    }

    public static int[] mergeSortedArrays(int[] arr, int[] arr2, int[] res, int n, int m) {

        int i = 0, j = 0;
        int resIndex = 0;

        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                res[resIndex] = arr[i];
                i++;
            } else {
                res[resIndex] = arr2[j];
                j++;
            }

            resIndex++;
        }

        while (i < arr.length) {
            res[resIndex] = arr[i];
            i++;
            resIndex++;
        }

        while (j < arr2.length) {
            res[resIndex] = arr2[j];
            resIndex++;
            j++;
        }

        return res;
    }

    public static int countTotalPaths(int i, int j, int n, int m) {

        // DEAD_END 
        if (i == n || j == m) {
            return 0;
        }

        // Destination
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // MOVE RIGHT
        int right = countTotalPaths(i, j + 1, n, m);

        // MOVE DOWN
        int down = countTotalPaths(i + 1, j, n, m);

        return down + right;

    }

    public static void main(String[] args) {
        // int n = 5;

        // System.out.println(" BEFORE I am OUTSIDE the function, = " + n);
        // int res = learningStack(n);
        // learningCallStack(n);
        // System.out.println("CODE ENDS");
        // printDescending(n);
        // printAscending(n, 1);
        // while(n < 10 ) {
        //     System.out.println(n);
        //     n--;
        // }
        // int res = sumOfNaturalNumbers(n);
        // System.out.println("Sum of first " + n + " Natural numbers = " + res);
        // int res = factorial(n);
        // System.out.println("Factorial of " + n + " = " + res);
        // pORc();
// =============================== MERGE SORT ===========================================
        // int[] newArr = {5, 1, 2, 3, 10, 4};
        // mergeSort(newArr, 0, newArr.length - 1);
        // for (int val : newArr) {
        //     System.out.print(val + " ");
        // }
//  =============================== MERGE SORT ===========================================
        int n = 4, m = 4;

        int res = countTotalPaths(0, 0, n, m);
        System.out.println("Total Paths = " + res);

    }
}
