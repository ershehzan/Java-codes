import java.util.Scanner; // Importing the Scanner class for user input

// Main class containing the program
class Main {
    public static void main(String[] args) {
        
        // Prompt the user to enter a number
        System.out.print("Enter the Number:");
        Scanner sn = new Scanner(System.in); // Creating a Scanner object to read input
        
        int n = sn.nextInt(); // Reading the integer input from the user
        
        // Outer loop to control the number of rows
        for (int i = 0; i < n; i++) {
            // Inner loop to control the numbers printed in each row
            for (int j = 1; j < n; j++) {
                System.out.print(j + " "); // Printing the value of the column
            }
            System.out.println(" "); // Move to the next line after each row
        }
    }
}
