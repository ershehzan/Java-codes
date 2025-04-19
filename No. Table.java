import java.util.Scanner; // Importing Scanner class for user input

// Main class
class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number:"); // Prompting user to input a number
        
        Scanner sn = new Scanner(System.in); // Creating a Scanner object to read input
        int n = sn.nextInt(); // Reading the integer input from user
        
        int i = 1; // Initializing counter variable
        
        // Loop to print the multiplication table of the number
        while (i <= 10) {
            // Printing the multiplication result for the current value of i
            System.out.println(n + "x" + i + "=" + i * n);
            
            i++; // Incrementing the counter
        }
    }
}
