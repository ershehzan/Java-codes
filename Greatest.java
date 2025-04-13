import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = p.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = p.nextInt();

        System.out.print("Enter 3rd number: ");
        int c = p.nextInt();

        if (a > b && a > c) {
            System.out.print("a is greatest");
        } else if (b > a && b > c) {
            System.out.print("b is greatest");
        } else {
            System.out.print("c is greatest");
        }

        p.close();
    }
}
