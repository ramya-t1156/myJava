import java.util.*;

public class BasicArrayOperations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input: Size of the array
        System.out.println("Enter size of an Array: ");
        int n = scn.nextInt();

        int sum = 0;
        int[] arr = new int[n];

        // Initializing max and min with the first element
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Input: Elements of the array and calculating sum, max, and min
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            sum += arr[i];

            // To find the maximum number
            if (arr[i] > max) {
                max = arr[i];
            }

            // To find the minimum number
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Output: Sum, Maximum, and Minimum
        System.out.println("Sum = " + sum);
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);

        // Sorting the array in ascending order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Output: Array elements in ascending order
        System.out.println("Array elements in Ascending order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Reversing the array to get non-ascending order
        int left = 0, right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // Output: Array elements in non-ascending order
        System.out.println("Array elements in Non-Ascending order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
