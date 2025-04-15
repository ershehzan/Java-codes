import java.util.Scanner; // Importing Scanner class for user input

// A program to determine pass or fail based on attendance and marks
class Main {
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner s = new Scanner(System.in);

        // Prompt user to enter the attendance percentage
        System.out.println("Enter the attendance:");
        int n = s.nextInt(); // Read the attendance input from the user

        // Prompt user to enter the marks
        System.out.println("Enter the marks:");
        int m = s.nextInt(); // Read the marks input from the user

        // Check conditions for passing or failing
        if (n < 75 && m < 40) {
            // Fail due to both low attendance and low marks
            System.out.println("FAIL DUE TO LOW ATTENDANCE AND LOW MARKS");
        } else if (n < 75) {
            // Fail due to low attendance only
            System.out.println("FAIL DUE TO LOW ATTENDANCE");
        } else if (m < 40) {
            // Fail due to low marks only
            System.out.println("FAIL DUE TO LOW MARKS");
        } else {
            // Pass if both conditions are met
            System.out.println("PASS");
        }

        // Close the scanner to avoid memory leaks
        s.close();
    }
}
