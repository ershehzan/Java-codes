import java.util.Scanner; // Importing Scanner class for user input

// Main class
class Main {
    public static void main(String[] s) {
        
        System.out.print("Enter the Number:"); // Prompting user to input the number of rows for the triangle pattern
        Scanner sn = new Scanner(System.in); // Creating a Scanner object to read input
        
        int n = sn.nextInt(); // Reading the number of rows from user input
        
        // Outer loop to handle the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to handle the number of columns in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(" *"); // Printing an asterisk for each column
            }
            System.out.println(" "); // Moving to the next line after each row
        }
    }
}
