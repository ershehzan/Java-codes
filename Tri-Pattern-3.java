import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int rows = scanner.nextInt();

        int number = 1; // Starting number

        System.out.println("Floyd's Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

        scanner.close();
    }
}
