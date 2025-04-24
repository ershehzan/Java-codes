import java.util.Scanner;

// Public class named PowerSeries
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value
        System.out.print("Enter the value: ");
        
        // Read the integer input from the user
        int n = scanner.nextInt();

        // Loop from 1 to the entered number (inclusive)
        for (int i = 1; i <= n; i++) {
            // Check if the current number 'i' is a factor of 'n'
            if (n % i == 0) {
                // Print the factor
                System.out.print(i + " ");
            }
        }
    }
}
