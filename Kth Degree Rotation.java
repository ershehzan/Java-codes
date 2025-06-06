import java.util.Scanner;

public class MatrixRotation {

    // Function to rotate the matrix by 90 degrees clockwise
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap elements at (i, j) and (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                // Swap elements at start and end of the row
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    // Function to print the matrix
    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize a 4x4 matrix
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt(); // Read number of 90-degree rotations

        // Normalize k to [0, 3]
        k = k % 4;
        if (k < 0) {
            k += 4;
        }

        // Rotate k times
        for (int i = 0; i < k; i++) {
            rotate(matrix);
        }

        System.out.println("Rotated Matrix:");
        printMatrix(matrix);

        sc.close(); // Close scanner to prevent resource leak
    }
}
