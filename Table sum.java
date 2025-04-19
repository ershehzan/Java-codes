import java.util.Scanner; // Importing Scanner class for user input

// Main class
class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number:"); // Prompting user to input a number
        Scanner sn = new Scanner(System.in); // Creating a Scanner object to read input
        int n = sn.nextInt(); // Reading the integer input from user
        
        int sum = 0; // Initializing variable to store the sum of products
        int i = 1; // Initializing counter variable
        
        // Loop to print the multiplication table and calculate the sum
        while (i <= 10) {
            int pro = i * n; // Calculating the product of the current number and input
            System.out.println(n + "x" + i + "=" + pro); // Printing the current multiplication result
            sum += pro; // Adding the product to the sum
            
            i++; // Incrementing the counter
        }
        
        // Printing the total sum of the multiplication table
        System.out.println("Sum of Table is: " + sum);
    }
}
