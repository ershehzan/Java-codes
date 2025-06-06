import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        // Initialize a 2D array with values
        int[][] arr = {
            {0, 1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10, 11},
            {12, 13, 14, 15, 16, 17},
            {18, 19, 20, 21, 22, 23},
            {24, 25, 26, 27, 28, 29},
            {30, 31, 32, 33, 34, 35}
        };

        int top = 0;
        int bottom = arr.length - 1;           // Last row index
        int left = 0;
        int right = arr[0].length - 1;         // Last column index

        while (top <= bottom && left <= right) {
            // Print top row (left to right)
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++;

            // Print right column (top to bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // Print bottom row (right to left)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }

            // Print left column (bottom to top)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }

        System.out.println(); // Newline at the end
    }
}
