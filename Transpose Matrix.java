import java.util.Scanner; // Importing Scanner class to take user input

// Main class to demonstrate the transpose of a matrix
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        // Declare and initialize a 3x3 matrix to store user input
        int[][] arr = new int[3][3];

        // Prompt the user to enter the elements of the matrix
        System.out.print("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) { // Loop through each row
            for (int j = 0; j < 3; j++) { // Loop through each column
                arr[i][j] = sc.nextInt(); // Read each element from the user
            }
        }

        // Display the transpose of the matrix
        // Transpose is achieved by swapping rows with columns (arr[j][i] instead of arr[i][j])
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < 3; i++) { // Loop through each row of the transposed matrix
            for (int j = 0; j < 3; j++) { // Loop through each column of the transposed matrix
                System.out.print(arr[j][i] + " "); // Print the transposed element
            }
            System.out.println(); // Move to the next line after printing a row
        }

        // Close the Scanner object to free up resources
        sc.close();
    }
}
