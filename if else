import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner s = new Scanner(System.in);

        // Prompt user to enter the attendance
        System.out.println("Enter the attendance:");
        int n = s.nextInt();

        // Prompt user to enter the marks
        System.out.println("Enter the marks:");
        int m = s.nextInt();

        // Check conditions for passing or failing
        if (n < 75 && m < 40) {
            System.out.println("FAIL DUE TO LOW ATTENDANCE AND LOW MARKS");
        } else if (n < 75) {
            System.out.println("FAIL DUE TO LOW ATTENDANCE");
        } else if (m < 40) {
            System.out.println("FAIL DUE TO LOW MARKS");
        } else {
            System.out.println("PASS");
        }

        // Close the scanner to avoid memory leaks
        s.close();
    }
}
