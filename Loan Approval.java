import java.util.Scanner; // Importing Scanner class for user input

// A program to determine loan approval based on credit score and salary
class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner s = new Scanner(System.in);

        // Prompt user to enter the credit score
        System.out.println("Enter the credit score:");
        int n = s.nextInt(); // Store the input in a variable

        // Prompt user to enter the salary
        System.out.println("Enter the Salary:");
        int m = s.nextInt(); // Store the input in a variable

        // Decision logic to check eligibility for loan approval
        if (n >= 600 && m >= 40000) {
            System.out.println("LOAN APPROVED"); // Print approval message if conditions are met
        } else {
            System.out.println("LOAN DENIED"); // Print denial message if conditions are not met
        }

        // Close the scanner to avoid memory leaks
        s.close();
    }
}
