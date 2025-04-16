import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers:");

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("Sum: " + sum);
                sum = 0; // Reset the sum for next round
            } else {
                sum += num;
            }
        }
    }
}
