
import java.util.Scanner;

public class Day3Pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println();

        // for (int i = 0; i < n; i++) {
        //     for (int spaces = n - 1; spaces > i; spaces--) {
        //         System.out.print("  ");
        //     }
        //     for (int stars = 0; stars < (2 * i) + 1; stars++) {
        //         // System.out.print("* ");
        //         // System.out.print(i+1 +  " ");
        //         System.out.print(stars + 1 + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("-------------------------------------------------------");
        // System.out.println("-------------- PALINDROME PYRAMID ---------------------");
        // System.out.println("-------------------------------------------------------");
        // for (int i = 0; i < n; i++) {
        //     for (int spaces = n - 1; spaces > i; spaces--) {
        //         System.out.print("  ");
        //     }
        //     for(int stars = 0; stars <= i; stars++) {
        //         System.out.print(stars+1 + " ");
        //     }
        //     for(int k = i; k > 0; k--) {
        //         System.out.print(k + " ");
        //     }
        //     System.out.println();
        // System.out.println("-------------------------------------------------------");
        // for (int i = 0; i < n; i++) {
        //     for (int space = 0; space < i; space++) {
        //         System.out.print("  ");
        //     }
        //     for (int stars = n - 1; stars >= i; stars--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("-------------------------------------------------------");
        // System.out.println("-------------- DIAMOND ---------------------");
        // System.out.println("-------------------------------------------------------");
        // for (int i = 0; i < n-1; i++) {
        //     for (int spaces = n - 1; spaces > i; spaces--) {
        //         System.out.print(" ");
        //     }
        //     for (int stars = 0; stars <= i; stars++) {
        //         // System.out.print(stars + 1 + " ");
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int space = 0; space < i; space++) {
        //         System.out.print(" ");
        //     }
        //     for (int stars = n - 1; stars >= i; stars--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // // System.out.println("-------------------------------------------------------");
        // // System.out.println("-------------- PURE DIAMOND ---------------------");
        // // System.out.println("-------------------------------------------------------");
        // for (int i = 0; i < (n/2)+1; i++) {
        //     for (int spaces = (n/2)- 1; spaces >= i; spaces--) {
        //         System.out.print(" ");
        //     }
        //     for (int stars = 0; stars <= i; stars++) {
        //         // System.out.print(stars + 1 + " ");
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < n/2; i++) {
        //     for (int space = 0; space <= i; space++) {
        //         System.out.print(" ");
        //     }
        //     for (int stars = (n/2) - 1; stars >= i; stars--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // // System.out.println("-------------------------------------------------------");
        // // System.out.println("-------------- HOLLOW PYRAMID ---------------------");
        // // System.out.println("-------------------------------------------------------");
        // for (int i = 0; i < n; i++) {
        //     for (int space = i; space < n - 1; space++) {
        //         System.out.print(" ");
        //     }
        //     for (int stars = 0; stars <= (2 * i); stars++) {
        //         if (i == n - 1  || stars == 0 || stars == 2 * i) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // System.out.println("-------------------------------------------------------");
        // System.out.println("-------------- HOLLOW DIAMOND ---------------------");
        // System.out.println("-------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            for (int space = i; space < n - 1; space++) {
                System.out.print(" ");
            }

            for (int stars = 0; stars <= (2 * i); stars++) {
                // if (i == n -1 || stars == 0 || stars == 2 * i) {
                if (stars == 0 || stars == 2 * i) {             // MODIFIED LINE
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int space = n-1; space > i; space--) {
                System.out.print(" ");
            }

            for (int stars = 2*i; stars >= 0; stars--) {
                if (i == n - 1 || stars == 0 || stars == 2 * i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
