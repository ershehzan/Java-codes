import java.util.Scanner; // Importing Scanner class for user input

// Main class
class Main {
    public static void main(String[] args) {
        
        System.out.print("Enter the Number:"); // Prompting user to input the size of the square pattern
        Scanner sn = new Scanner(System.in); // Creating a Scanner object to read input
        
        int n = sn.nextInt(); // Reading the size of the square pattern from the user
        
        // Outer loop to handle the number of rows
        for (int i = 0; i < n; i++) {
            // Inner loop to handle the number of columns
            for (int j = 0; j < n; j++) {
                System.out.print("*"); // Printing asterisk for each column
            }
            System.out.println(" "); // Moving to the next line after each row
        }
    }
}
