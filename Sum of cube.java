import java.util.Scanner; // Import the Scanner class for taking user input

// A program to calculate and display the sum of cubes of numbers from 1 to n
public class cubeSum {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter the value: ");
        int n = scanner.nextInt(); // Read the input value (n), which determines the range

        int sum = 0; // Initialize the variable to store the cumulative sum of cubes

        // Loop from 1 to n to calculate the cube of each number and add it to the sum
        for (int i = 1; i <= n; i++) {
            sum += i * i * i; // Add the cube of the current number (i) to the sum
            // Display the current calculation step, showing the cube and the cumulative sum
            System.out.println(i + "x" + i + "x" + i + "=" + sum);
        }
        // Close the Scanner to release resources
        scanner.close();
    }
}
