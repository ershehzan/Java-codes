import java.util.Scanner;

public class MatrixBinarySearch {
    public static void main(String[] args) {
        // Initialize a 4x4 2D matrix
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to be searched: ");
        int x = sc.nextInt(); // Element to search

        int n = arr.length;         // Number of rows
        int m = arr[0].length;      // Number of columns

        int start = 0;
        int end = n * m - 1;

        boolean found = false;

        // Binary search
        while (start <= end) {
            int mid = (start + end) / 2;

            int rowIndex = mid / m;
            int colIndex = mid % m;

            int value = arr[rowIndex][colIndex];

            if (value == x) {
                System.out.println("Element found at index: " + mid); // In the flattened array
                found = true;
                break;
            } else if (value < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close(); // Close the scanner
    }
}
