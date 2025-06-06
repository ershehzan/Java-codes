import java.util.Scanner;

// This class implements binary search on a 2D matrix, treating it as a flattened sorted array.
public class MatrixBinarySearch {
    public static void main(String[] args) {
        // Initialize a 4x4 2D matrix with sorted elements
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to be searched: ");
        int x = sc.nextInt(); // Read the element to search for

        int n = arr.length;         // Number of rows in the matrix
        int m = arr[0].length;      // Number of columns in the matrix

        // Define the search range for binary search (using a virtual flattened array)
        int start = 0;
        int end = n * m - 1;        // Last index in the flattened array

        boolean found = false;      // Flag to indicate if the element is found

        // Perform binary search on the virtual 1D representation of the 2D matrix
        while (start <= end) {
            int mid = (start + end) / 2;            // Calculate the mid index

            int rowIndex = mid / m;                 // Map mid index to row in 2D matrix
            int colIndex = mid % m;                 // Map mid index to column in 2D matrix

            int value = arr[rowIndex][colIndex];    // Get the value at the calculated position

            if (value == x) {
                // If the element is found, print its position (in the flattened array)
                System.out.println("Element found at index: " + mid);
                found = true;                       // Set the flag to true
                break;                              // Exit the loop as the element is found
            } else if (value < x) {
                // If the current value is less than the target, search right half
                start = mid + 1;
            } else {
                // If the current value is greater than the target, search left half
                end = mid - 1;
            }
        }

        // If the element is not found after the loop, print a message
        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close(); // Close the Scanner to free up resources
    }
}
