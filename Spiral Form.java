import java.util.*;

/**
 * This class demonstrates how to print a 2D matrix in spiral order.
 * The spiral starts from the top-left corner and goes clockwise.
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        // Initialize a 6x6 2D array with values
        int[][] arr = {
            {0, 1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10, 11},
            {12, 13, 14, 15, 16, 17},
            {18, 19, 20, 21, 22, 23},
            {24, 25, 26, 27, 28, 29},
            {30, 31, 32, 33, 34, 35}
        };

        // Define the boundaries of the spiral
        int top = 0;                       // Topmost row index
        int bottom = arr.length - 1;       // Bottommost row index
        int left = 0;                      // Leftmost column index
        int right = arr[0].length - 1;     // Rightmost column index

        // Continue printing while there are rows and columns remaining
        while (top <= bottom && left <= right) {
            // Print the top row from left to right
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++; // Move the top boundary down

            // Print the right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--; // Move the right boundary left

            // Print the bottom row from right to left, if any rows remain
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--; // Move the bottom boundary up
            }

            // Print the left column from bottom to top, if any columns remain
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++; // Move the left boundary right
            }
        }

        System.out.println(); // Print a newline at the end for clean output
    }
}
