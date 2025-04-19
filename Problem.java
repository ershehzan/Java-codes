import java.util.Scanner; // Importing Scanner class for user input

// Main class
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input
        int sum = 0; // Initializing variable to store the sum of numbers

        System.out.println("Enter numbers:"); // Prompt user to enter numbers

        // Infinite loop to keep reading numbers from user
        while (true) {
            int num = scanner.nextInt(); // Reading the next integer input from user

            // Check if the entered number is 0
            if (num == 0) {
                // Print the current sum
                System.out.println("Sum: " + sum);
                sum = 0; // Reset the sum for the next round
            } else {
                sum += num; // Add the number to the sum if it's not 0
            }
        }
    }
}
