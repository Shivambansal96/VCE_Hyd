
import java.util.Scanner;

public class Day2Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // // // (Brute Force) Pattern 1 // // //
        // System.out.println("*");
        // System.out.println("* *");
        // System.out.println("* * * ");
        // System.out.println("* * * *");
        // System.out.println("* * * * *");
        // // // // (Brute Force) Pattern 2 // // //
        // System.out.println("*****   ****");
        // System.out.println("*       *   *");
        // System.out.println("*       *   *");
        // System.out.println("*****   ****");
        // System.out.println("    *   *   *");
        // System.out.println("    *   *   *");
        // System.out.println("*****   ****");
        // // // // Pattern 0 // // //
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // =============================================================================== //
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();

        System.out.println();

        // int[] arr = {4, 9, 2, 7, 5};
        // // // // Pattern 1  // // //
        // for (int row = 0; row < n; row++) {
        //     for (int col = 0; col <= row; col++) {
        //         // System.out.print((row + 1) * (col + 1) + " ");
        //         // System.out.print("* ");
        //         // System.out.print((col + 1) + " ");
        //         // char c = (char) (col + 65);
        //         // System.out.print((c) + " ");
        //         // System.out.print("(" + row + ", " + col + ") ");
        //         // System.out.print(arr[col] + " ");
        //     }
        //     System.out.println();
        // }
        // for (int i = n - 1; i >= 0; i--) {
        //     for (int j = n - 1; j >= i; j--) {
        //         System.out.print("(" + (i + 1) + ", " + (j + 1) + ") ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("-----------------------------");
        // // // Pattern 2  // // //
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                // System.out.print("* ");
                // System.out.print(j + 1 + " ");
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
        // for (int i = n; i > 0; i--) {
        //     for (int j = i; j > 0; j--) {
        //         System.out.print((i * j) + " ");
        //     }
        //     System.out.println();
        // }
        // int[] arr = {8, 6, 4, 2, 9};
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
        //             // System.out.print("*");
        //             System.out.print(arr[i] + " ");
        //             // System.out.print(arr[j] + " ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {

        //         if (i == j || i + j == n - 1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

    }
}
