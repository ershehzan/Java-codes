import java.util.Scanner; // Importing the Scanner class for user input

// Main class to demonstrate user input and manipulation of a 2D array
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input from the user

        // Prompt the user to enter the number of rows for the 2D array
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt(); // Read the number of rows from the user

        // Prompt the user to enter the number of columns for the 2D array
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt(); // Read the number of columns from the user

        // Initialize a 2D array with the specified number of rows and columns
        int[][] arr = new int[rows][cols];

        // Prompt the user to enter the elements of the 2D array
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) { // Outer loop iterates over each row
            for (int j = 0; j < cols; j++) { // Inner loop iterates over each column in the current row
                arr[i][j] = scanner.nextInt(); // Read and store the element in the 2D array
            }
        }

        // Display the 2D array in matrix form
        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) { // Outer loop iterates over each row
            for (int j = 0; j < cols; j++) { // Inner loop iterates over each column in the current row
                System.out.print(arr[i][j] + " "); // Print the current element followed by a space
            }
            System.out.println(); // Move to the next line after printing all columns of the current row
        }

        scanner.close(); // Close the Scanner object to release resources
    }
}
