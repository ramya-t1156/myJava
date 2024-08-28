import java.util.*;

/**
 * Question:
 * Write a Java program to print an inverted right-angled triangle pattern using asterisks ('*').
 * The number of rows is determined by the user input 'n'. The first row contains 'n' asterisks,
 * and each subsequent row decreases by one asterisk until the last row contains one asterisk.
 *
 * Example:
 * Input: 5
 * Output:
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 */

class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input: Number of rows
        System.out.println("Enter a Number: ");
        int n = scn.nextInt();

        // Print inverted triangle pattern
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
