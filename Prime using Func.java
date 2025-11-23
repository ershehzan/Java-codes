import java.util.Scanner; // Importing the Scanner class for user input
// Main class containing the logic for checking if a number is prime
public class Main {

    static void prime(int n) {
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }

        int count = 0; // Counter to track if any divisor is found

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++; // Found a divisor
                break;   // No need to check further
            }
        }

        if (count == 0) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Read the input number

        prime(n);
    }
}
