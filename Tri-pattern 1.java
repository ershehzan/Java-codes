import java.util.Scanner; // Importing the Scanner class for user input

// Main class containing the entry point of the program
class Main {
    public static void main(String[] s) {
        
        // Prompt the user to enter a number
        System.out.print("Enter the Number:");
        Scanner sn = new Scanner(System.in); // Create a Scanner object to read user input
        
        int n = sn.nextInt(); // Read an integer input from the user
        
        // Outer loop: Iterates from 1 to n (each row of the pattern)
        for (int i = 1; i <= n; i++) {
            // Inner loop: Prints '*' characters for each column in the current row
            // Starts from the current row number and goes up to n
            for (int j = i; j <= n; j++) {
                System.out.print(" *"); // Print '*' with a space
            }
            System.out.println(" "); // Move to the next line after completing the row
        }
    }
}
