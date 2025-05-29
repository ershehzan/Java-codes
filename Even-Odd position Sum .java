import java.util.Scanner;

// Main class containing the program entry point
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array and read the value
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        // Declare and initialize an integer array of size n
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.print("Enter the elements of array: ");
        // Loop to read each element of the array from the user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize variables to store the sums of elements at even and odd positions
        int even = 0; // Sum for even positions (2, 4, 6, ...)
        int odd = 0;  // Sum for odd positions (1, 3, 5, ...)

        // Iterate through the array to calculate sums
        for (int i = 0; i < n; i++) {
            // Array positions are considered 1-based (i+1)
            if ((i + 1) % 2 == 0) {
                // If position is even, add element to 'even' sum
                even += arr[i];
            } else {
                // If position is odd, add element to 'odd' sum
                odd += arr[i];
            }
        }

        // Calculate the absolute difference between the even and odd sums
        int diff = Math.abs(even - odd);

        // Output the result
        System.out.print("Output: " + diff);
    }
}
