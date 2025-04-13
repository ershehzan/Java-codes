import java.util.Scanner;

class Bill {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Prompt user to enter the units consumed
        System.out.print("Enter the units consumed: ");
        int n = s.nextInt();

        double bill;

        // Calculate the bill based on the units consumed
        if (n > 0 && n <= 100) {
            bill = n * 0.75;
        } else if (n > 100 && n < 300) {
            bill = n * 1.20;
        } else if (n >= 300) {
            bill = n * 1.50;
        } else {
            System.out.println("Invalid input. Units must be greater than 0.");
            s.close();
            return;
        }

        System.out.println("Bill: ₹" + bill);

        // Close the scanner to avoid memory leaks
        s.close();
    }
}
