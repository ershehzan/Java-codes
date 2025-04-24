import java.util.Scanner;

// Main class containing the program
class Main {
    public static void main(String[] args) {

        // Create a Scanner object for input (not used in this code)
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize an array of integers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        // Number of elements in the array
        int n = 10;

        // Variable to store the sum of all elements in the array
        int sum = 0;

        // Loop through the array to calculate the sum of its elements
        for (int i = 0; i < n; i++) {
            // Add the current element to the sum
            sum += arr[i];
        }

        // Print the total sum of the array elements
        System.out.print("Sum of Array Element is: " + sum);
    }
}
