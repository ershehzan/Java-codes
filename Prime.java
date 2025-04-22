import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        scanner.close();

        int count = 0;

        System.out.print("Prime numbers between 1 and " + n + " are:");

        for (int i = 2; i <= n; i++) {
            boolean Prime = true;

            // Check if i is prime
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    Prime = false;
                    break;
                }
            }

            // If i is prime, print it and increase the count
            if (Prime) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.print("\n prime numbers between 1 to " + n + " is: " + count);
    }
}
