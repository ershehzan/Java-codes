import java.util.Scanner; // Importing the Scanner class for user input

// Main class to perform a 90-degree rotation of a 3x3 matrix
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for reading input

        // Declare and initialize a 3x3 matrix for input
        int[][] arr = new int[3][3];
        // Declare and initialize a 3x3 matrix to store the result after rotation
        int[][] ans = new int[3][3];

        // Prompt the user to enter the elements of the matrix
        System.out.print("Enter the Elements of Matrix:");
        for (int i = 0; i < 3; i++) { // Loop through each row
            for (int j = 0; j < 3; j++) { // Loop through each column
                arr[i][j] = sc.nextInt(); // Read the element and store it in the matrix
            }
        }

        // Perform the 90-degree rotation
        // For each element in the original matrix, calculate its new position
        for (int i = 0; i < 3; i++) { // Loop through each row of the original matrix
            for (int j = 0; j < 3; j++) { // Loop through each column of the original matrix
                ans[j][2 - i] = arr[i][j]; // Assign the rotated position in the result matrix
            }
        }

        // Print the matrix after the 90-degree rotation
        System.out.println("Matrix after 90 degree rotation:");
        for (int i = 0; i < 3; i++) { // Loop through each row of the rotated matrix
            for (int j = 0; j < 3; j++) { // Loop through each column of the rotated matrix
                System.out.print(ans[i][j] + " "); // Print the element in the rotated matrix
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close the Scanner object to free up resources
    }
}
