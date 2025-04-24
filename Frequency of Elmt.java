import java.util.*;

// Main class containing the program
class Main {
    public static void main(String[] args) {
        // Initialize an array with elements
        int[] arr = {1, 3, 3, 2, 3, 5};

        // Length of the array
        int n = 6;

        // Target element whose frequency is to be calculated
        int target = 3;

        // Variable to count the occurrences of the target element
        int count = 0;

        // Variable to count the number of odd-indexed elements
        int oddCount = 0;

        // Loop through the array
        for (int i = 0; i < n; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                count++; // Increment the count if there's a match
            }

            // Check if the current index is odd
            if (i % 2 != 0) {
                oddCount++; // Increment the odd index counter
            }
        }

        // Print the frequency of the target element in the array
        System.out.println(target + " appears " + count + " times");

        // Print the count of elements at odd indices
        System.out.println("Odd-indexed elements: " + oddCount);
    }
}
