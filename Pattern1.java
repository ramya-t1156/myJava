import java.util.*;

/**
 * Question:
 * Write a Java program to print a right-angled triangle pattern using asterisks ('*').
 * The user inputs a number 'n', which determines the number of rows in the triangle.
 * Each row 'i' contains 'i+1' asterisks, forming a right-angled triangle shape.
 *
 * Example:
 * Input: 5
 * Output:
 * *
 * * *
 * * * *
 * * * * *
 */

class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Input: Number of rows for the triangle
        System.out.println("Enter a Number: ");
        int n = scn.nextInt();

        // Outer loop for each row
        for (int i = 0; i < n; i++) {
            // Inner loop to print asterisks in each row
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            // New line after each row
            System.out.println();
        }
    }
}
