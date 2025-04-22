import java.util.Scanner; // Import the Scanner class to handle user input

// A program to calculate the sum of the series: 1/1^1 + 1/2^2 + 1/3^3 + ... + 1/n^n
public class PowerSeries {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the value of 'n' for the series
        System.out.print("Enter the value: ");
        int n = scanner.nextInt(); // Read the input value for the upper limit of the series

        double sum = 0.0; // Initialize the variable to store the sum of the series

        // Loop through numbers from 1 to n to calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            // Add the reciprocal of i raised to the power of i to the sum
            sum += 1.0 / Math.pow(i, i); 
        }

        // Print the final sum of the series
        System.out.printf("The sum of the series is: %.6f", sum); // Format the output to 6 decimal places
        
        // Close the Scanner object to release resources
        scanner.close();
    }
}
