import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Temperature:");
        int n = s.nextInt();

        // Analyze the temperature input
        if (n < 0) {
            System.out.println("Freezing Warning");
        } else if (n > 0 && n <= 20) {
            System.out.println("Cold");
        } else if (n > 20 && n <= 35) {
            System.out.println("Normal");
        } else {
            System.out.println("Heat Alert");
        }

        // Close the scanner to avoid memory leaks
        s.close();
    }
}
