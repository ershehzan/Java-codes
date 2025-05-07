import java.util.Scanner;

public class FloydsTriangle01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Enter the number of rows for 0-1 Floyd's Triangle: ");
        int rows = scanner.nextInt();

        System.out.println("0-1 Floyd's Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Print 1 if sum of row and column is even, else print 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
