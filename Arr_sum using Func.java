import java.util.Scanner; // Importing the Scanner class for user input

// Main class containing the program logic
public class Main {

    /**
     * This method calculates the sum of all elements in an integer array.
     * @param arr The input array containing integer elements.
     * @return The sum of all integers in the array.
     */
    static int Arr_sum(int[] arr) {
        int sum = 0; // Initialize sum to 0
        // Iterate through each element of the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Add the current element to the sum
        }
        return sum; // Return the final sum
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt(); // Read the size input

        // Declare an integer array of the specified size
        int[] arr = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); // Read each element
        }

        // Calculate the sum of the array elements using the Arr_sum method
        int sum = Arr_sum(arr);

        // Display the sum of the array elements
        System.out.println("The sum of the array elements is: " + sum);
    }
}
