import java.util.Scanner;
/**
 * This class provides functionality to rotate a square matrix by k * 90 degrees clockwise,
 * where k is input by the user. It also includes a utility to print the matrix.
 */
public class MatrixRotation {
    /**
     * Rotates the given square matrix by 90 degrees clockwise in-place.
     * This is done in two steps:
     *   1. Transpose the matrix (swap rows and columns)
     *   2. Reverse each row to complete the 90-degree rotation
     *
     * @param matrix The square matrix to be rotated
     */
    public static void rotate(int[][] matrix)
    {
        int n = matrix.length;

        // Step 1: Transpose the matrix (convert rows to columns)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap elements at (i, j) and (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row to achieve 90-degree rotation
        for (int i = 0; i < n; i++)
        {
            int start = 0, end = n - 1;
            while (start < end) {
                // Swap elements at the beginning and end of the row
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    /**
     * Prints the given matrix row by row.
     *
     * @param matrix The matrix to print
     */
    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }
    }

    /**
     * Main method to demonstrate and test matrix rotation.
     * It creates a 4x4 matrix, takes input for the number of 90-degree rotations,
     * performs the rotation, and prints the result.
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Initialize a 4x4 matrix with sample values
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt(); // Read the number of 90-degree rotations

        // Normalize k to the range [0, 3] since rotating 4 times results in the original matrix
        k = k % 4;
        if (k < 0) {
            k += 4; // Handle negative rotations
        }

        // Perform the rotation k times
        for (int i = 0; i < k; i++) {
            rotate(matrix);
        }

        // Output the rotated matrix
        System.out.println("Rotated Matrix:");
        printMatrix(matrix);

        sc.close(); // Always close the scanner to prevent resource leaks
    }
}
