import java.util.Scanner; // Importing Scanner class for user input

// Main class
class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number:"); // Prompting user to input a number
        
        Scanner sn = new Scanner(System.in); // Creating a Scanner object to read input
        int n = sn.nextInt(); // Reading the integer input from user
        
        int fact = 1; // Initializing the variable to store factorial result
        int i = 1; // Initializing counter variable
        
        // Loop to calculate factorial of the input number
        while (i <= n) {
            fact *= i; // Multiplying fact with the current value of i
            i++; // Incrementing the counter
        }
        
        // Printing the factorial result
        System.out.println("Factorial of the number " + n + " is: " + fact);
    }
}
