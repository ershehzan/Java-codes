class Main {
    public static void main(String[] args) {
        // Define and initialize a 2D array with predefined values
        int[][] arr = {
            {1, 2, 3, 4}, // First row of the 2D array
            {5, 6, 7, 8}, // Second row of the 2D array
            {9, 1, 2, 3}  // Third row of the 2D array
        };

        // Print a header to indicate the 2D array structure
        System.out.println("2D Array is:");

        // Iterate through each row of the 2D array
        for (int i = 0; i < 3; i++) { // Outer loop for rows
            for (int j = 0; j < 4; j++) { // Inner loop for columns
                // Print each element in the current row with a space
                System.out.print(arr[i][j] + "  ");
            }
            // Move to the next line after printing all columns in the current row
            System.out.println();
        }
    }
}
