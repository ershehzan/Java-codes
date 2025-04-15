import java.util.Scanner; // Importing Scanner class for user input

// A program to determine the greatest number among three numbers
public class Greatest {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in); // Creating a Scanner object to read input

        // Prompting the user to enter the first number
        System.out.print("Enter 1st number: ");
        int a = p.nextInt(); // Reading the first number

        // Prompting the user to enter the second number
        System.out.print("Enter 2nd number: ");
        int b = p.nextInt(); // Reading the second number

        // Prompting the user to enter the third number
        System.out.print("Enter 3rd number: ");
        int c = p.nextInt(); // Reading the third number

        // Comparing the three numbers to determine the greatest
        if (a > b && a > c) {
            System.out.print("a is greatest"); // Printing if 'a' is the greatest
        } else if (b > a && b > c) {
            System.out.print("b is greatest"); // Printing if 'b' is the greatest
        } else {
            System.out.print("c is greatest"); // Printing if 'c' is the greatest
        }

        p.close(); // Closing the Scanner object to free resources
    }
}
