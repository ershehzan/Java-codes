import java.util.Scanner; // Importing the Scanner class for user input

// Main class to demonstrate matrix addition
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for reading input

        // Define the number of rows and columns for the matrices
        int rows = 2, cols = 2;

        // Declare and initialize the first matrix
        int[][] arr1 = new int[rows][cols];
        // Declare and initialize the second matrix
        int[][] arr2 = new int[rows][cols];
        // Declare and initialize the result matrix to store the sum
        int[][] ans = new int[rows][cols];

        // Prompt the user to enter the elements of the first matrix
        System.out.print("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) { // Loop through each row
            for (int j = 0; j < cols; j++) { // Loop through each column
                arr1[i][j] = sc.nextInt(); // Read and store each element in the first matrix
            }
        }

        // Prompt the user to enter the elements of the second matrix
        System.out.print("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) { // Loop through each row
            for (int j = 0; j < cols; j++) { // Loop through each column
                arr2[i][j] = sc.nextInt(); // Read and store each element in the second matrix
            }
        }

        // Perform matrix addition and display the result
        System.out.println("Matrix after addition:");
        for (int i = 0; i < rows; i++) { // Loop through each row
            for (int j = 0; j < cols; j++) { // Loop through each column
                ans[i][j] = arr1[i][j] / arr2[i][j]; // Add corresponding elements of both matrices
                System.out.print(ans[i][j] + " "); // Print the element of the resulting matrix
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close the Scanner object to free up resources
    }
}
