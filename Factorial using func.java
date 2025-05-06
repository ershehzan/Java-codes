import java.util.Scanner; // Importing the Scanner class for user input

// Main class that contains the logic for calculating factorial
public class Main {

    /**
     * This method calculates and prints the factorial of a given number.
     * @param n The number for which the factorial is to be calculated.
     */
    static void fact(int n) {
        int factorial = 1; // Initialize the factorial to 1
        // Loop from 1 to n to calculate the factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiply the current value of factorial by i
        }
        // Print the calculated factorial
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the value: ");
        int n = sc.nextInt(); // Read the input number

        // Call the fact method to calculate and print the factorial
        fact(n);
    }
}
