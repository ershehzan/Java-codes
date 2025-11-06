import java.util.Scanner; // Importing Scanner class for user input

// A program to provide temperature analysis based on user input
class Main {
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner s = new Scanner(System.in);

        // Prompt user to enter the temperature
        System.out.println("Enter the Temperature:");
        int n = s.nextInt(); // Read the temperature input from the user

        // Analyze the temperature and provide feedback
        if (n < 0) {
            System.out.println("Freezing Warning"); // Display a freezing warning for temperatures below 0
        } 
        else if (n > 0 && n <= 20) {
            System.out.println("Cold"); // Display "Cold" for temperatures between 1 and 20
        }
        else if (n > 20 && n <= 35) {
            System.out.println("Normal"); // Display "Normal" for temperatures between 21 and 35
        } else {
            System.out.println("Heat Alert"); // Display a heat alert for temperatures above 35
        }

        // Close the scanner to avoid memory leaks
        s.close();
    }
}
