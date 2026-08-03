
public class Day7Recursion {

    public static int printNTo1(int n) {

        if (n == 1) {
            return 1;
        }

        System.out.println(n);
        return printNTo1(n - 1);
        // return 1;
    }

    public static void learningCallStack(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("Inside Fn, Before = " + n);
        learningCallStack(n - 1);
        System.out.println("Inside Fn, After = " + n);

    }

    public static void print1ToN(int i, int n) {

        if (i == n + 1) {
            return;
        }

        System.out.println(i);
        print1ToN(i + 1, n);
    }

    public static void main(String[] args) {
        // int n = 3;
        // printNTo1(n);

        // System.out.println("Code Starts");
        // int n = 3;
        // learningCallStack(n);
        // System.out.println("Done ?");
        int n = 5;
        print1ToN(1, n);
    }

}
