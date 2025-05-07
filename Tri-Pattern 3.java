import java.util.Scanner; // Importing the Scanner class for user input

// Class definition for generating Floyd's Triangle
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to input the number of rows for Floyd's Triangle
        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int rows = scanner.nextInt(); // Read the number of rows input by the user

        int number = 1; // Initialize the starting number of the triangle

        // Display Floyd's Triangle
        System.out.println("Floyd's Triangle:");
        for (int i = 1; i <= rows; i++) { // Outer loop for each row
            for (int j = 1; j <= i; j++) { // Inner loop for each column in the current row
                // Print the current number and increment it
                System.out.print(number + " ");
                number++;
            }
            // Move to the next line after completing a row
            System.out.println();
        }

        scanner.close(); // Close the Scanner object to release resources
    }
}
