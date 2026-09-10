
import java.util.Scanner;

public class Day1Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("Pattern for " + n + " rows: ");
        // // // (DEMO) Patterns // // //
        // System.out.println("*****");
        // System.out.println("*****");
        // System.out.println("*****");
        // System.out.println("*****");
        // System.out.println("*****");
        // System.out.println("  *****         *****");
        // System.out.println("*               *    *");
        // System.out.println("*               *    *");
        // System.out.println("******          *****");
        // System.out.println("      *         *    *");
        // System.out.println("      *         *    *");
        // System.out.println("******          *****");
        //  =================================== //
        // // // Pattern 1 // // //
        //  =================================== //
        int[] arr = {4, 9, 2, 7, 5};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
                // System.out.print(i+1 + " ");
                // System.out.print(j+1 + " ");
                // System.out.print((n - j) + " ");
                // System.out.print(((char)(i+65)) + " ");
                // System.out.print(((char)(j+65)) + " ");
                // System.out.print(((i+1)*(1+j)) + " ");
                // System.out.print(arr[j] + " ");
                // if((i + j) % 2 == 0)
                //     System.out.print(1 + " ");
                // else
                //     System.out.print(0 + " ");
            }
            System.out.println();
        }

    }
}
