
public class Day7Recursion {

    public static void learningStack(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("INSIDE FN, BEFORE = " + n);
        learningStack(n - 1);
        System.out.println("INSIDE FN, AFTER = " + n);
    }

    public static void printNumDesc(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumDesc(n - 1);
    }

    public static void printNumAscM1(int n) {
        if (n == 0) {
            return;
        }
        printNumAscM1(n - 1);
        System.out.println(n);
    }

    public static void printNumAscM2(int n, int i) {
        if (i == n) {
            return;
        }
        printNumAscM2(n, i + 1);
        System.out.println(i);
    }

    public static int sumOfnNaturalNos(int n) {

        if (n == 0) {
            return 0;
        }

        return n + sumOfnNaturalNos(n - 1);
    }

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int permutation(int n, int r) {

        int num = factorial(n);
        int denom = factorial(n - r);

        return num / denom;

    }

    public static void main(String[] args) {
        // System.out.println("CODE STARTS");
        // int n = 3;
        // learningStack(n);
        // System.out.println("CODE ENDS");
        // printNumDesc(n);
        // int n = 3;
        // printNumAscM1(n);
        // printNumAscM2(n, 1);

        // int n = 3;
        // System.out.println("Sum of " + n + " natural numbers = " + sumOfnNaturalNos(n));
        // int n = 3;
        // System.out.println("Factorial of " + n + " = " + sumOfnNaturalNos(n));
        int n = 5;
        int r = 3;
        System.out.println("Permutation of " + n + " and " + r + " = " + permutation(n, r));
    }

}
