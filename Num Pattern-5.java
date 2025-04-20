import java.util.Scanner; // Importing the Scanner class for user input

// Main class containing the program
class Main {
    public static void main(String[] args) {
        
        // Prompt the user to enter a number
        System.out.print("Enter the Number:");
        Scanner sn = new Scanner(System.in); // Creating a Scanner object to read input
        
        int n = sn.nextInt(); // Reading the integer input from the user
        
        // Outer loop to iterate through rows (from 1 to n)
        for (int i = 1; i <= n; i++) {
            // Inner loop to iterate through columns (from 1 to n)
            for (int j = 1; j <= n; j++) {
                System.out.print(j * j + " "); // Printing the square of the column number
            }
            System.out.println(" "); // Move to the next line after each row
        }
    }
}
