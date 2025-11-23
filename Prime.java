import java.util.Scanner; // Importing the Scanner class for user input
// Main class containing the entry point of the program
class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: "); // Prompt the user to enter a number
        int n = scanner.nextInt(); // Read the integer input from the user
        
        int count = 0; // Variable to count the number of prime numbers found

        System.out.print("Prime numbers between 1 and " + n + " are:");

        // Loop through all numbers from 2 to n to check for prime numbers
        for (int i = 2; i <= n; i++) {
           int divcount=0;// Assume the current number is prime

            // Inner loop: Check if the current number i is divisible by any number other than 1 and itself
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) { // If i is divisible by j, it's not a prime number
                   divcount++; // Mark the number as not prime
                    break; // Exit the inner loop early as we found a divisor
                }
            }

            // If the number is prime, print it and increment the count
            if (divcount==0) {
                System.out.print(i + " "); // Print the prime number
                count++; // Increment the count of prime numbers
            }
        }

        // Print the total count of prime numbers between 1 and n
        System.out.print("\nNumber of prime numbers between 1 and " + n + " is: " + count);
    }
}
