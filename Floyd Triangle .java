import java.util.Scanner; // Importing the Scanner class to take user input

// Class to generate 0-1 Floyd's Triangle
public class FloydsTriangle01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the number of rows for the triangle
        System.out.print("Enter the number of rows for 0-1 Floyd's Triangle: ");
        int rows = scanner.nextInt(); // Read the number of rows from user input

        // Display the heading for the triangle
        System.out.println("0-1 Floyd's Triangle:");
        
        // Outer loop to handle the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to handle the number of columns in the current row
            for (int j = 1; j <= i; j++) {
                // Check if the sum of the row and column indices is even
                // If even, print 1; otherwise, print 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1 "); // Print 1 for even sum
                } else {
                    System.out.print("0 "); // Print 0 for odd sum
                }
            }
            // Move to the next line after completing a row
            System.out.println();
        }

        scanner.close(); // Close the Scanner object to free up resources
    }
}
