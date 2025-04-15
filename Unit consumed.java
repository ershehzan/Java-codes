import java.util.Scanner; // Importing Scanner class for user input

// A program to calculate the electricity bill based on units consumed
class Bill {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Creating a Scanner object to read input

        // Prompt user to enter the units consumed
        System.out.print("Enter the units consumed: ");
        int n = s.nextInt(); // Read the units consumed from the user

        double bill; // Variable to store the calculated bill amount

        // Calculate the bill based on the units consumed
        if (n > 0 && n <= 100) {
            bill = n * 0.75; // Rate for units between 1 and 100
        } else if (n > 100 && n < 300) {
            bill = n * 1.20; // Rate for units between 101 and 299
        } else if (n >= 300) {
            bill = n * 1.50; // Rate for units 300 and above
        } else {
            // Handle invalid input where units are less than or equal to 0
            System.out.println("Invalid input. Units must be greater than 0.");
            s.close(); // Close the scanner to avoid memory leaks
            return; // Exit the program
        }

        // Display the calculated bill
        System.out.println("Bill: ₹" + bill);

        // Close the scanner to avoid memory leaks
        s.close();
    }
}
