import java.util.Scanner; // Importing the Scanner class for user input

// Main class containing the logic for checking if a number is prime
public class Main {

    /**
     * This method checks whether a given number is prime or not.
     * A number is considered prime if it is greater than 1 and has no divisors other than 1 and itself.
     * 
     * @param num The number to check for primality.
     * @return true if the number is prime, false otherwise.
     */
    static boolean isPrime(int num) {
        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }
        // Iterate from 2 to the square root of the number
        // If the number is divisible by any of these, it is not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // Check if 'num' is divisible by 'i'
                return false; // If divisible, the number is not prime
            }
        }
        // If no divisors are found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Read the input number

        // Check if the number is prime using the isPrime method
        if (isPrime(n)) {
            System.out.println(n + " is a prime number."); // Output if the number is prime
        } else {
            System.out.println(n + " is not a prime number."); // Output if the number is not prime
        }
    }
}
