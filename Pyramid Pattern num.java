import java.util.Scanner; // Importing the Scanner class for user input

// Main class containing the entry point of the program
class Main {
    public static void main(String[] s) {
        
        // Prompting the user to enter a number
        System.out.print("Enter the Number:");
        Scanner sn = new Scanner(System.in); // Create a Scanner object to read input from the user
        
        int n = sn.nextInt(); // Read the integer input from the user
        int temp = 1; // Initialize a variable to keep track of the numbers to be printed
        
        // Outer loop: Iterates from 1 to n (each row of the pattern)
        for (int i = 1; i <= n; i++) {
            
            // Inner loop 1: Adds spaces to align the pyramid structure
            // Runs from the current row number up to n-1
            for (int j = i; j < n; j++) {
                System.out.print(" "); // Print a single space
            }
            
            // Inner loop 2: Prints the numbers in the current row
            // Starts from 1 and goes up to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " "); // Print the current number followed by a space
                temp++; // Increment the number to be printed next
            }
            
            // Move to the next line after completing the row
            System.out.println();
        }
    }
}
