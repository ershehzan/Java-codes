import java.util.Scanner;

// Main class containing the program
class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user (not currently used in this code)
        Scanner scanner = new Scanner(System.in);

        // Example hardcoded array of integers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        // Number of elements in the array
        int n = 10;

        // Variable to store the current maximum value in the array
        int x = 0;

        // Variable to store the maximum element found in the array
        int ans = 0;

        // Loop through the array to find the maximum element
        for (int i = 0; i < n; i++) {
            // Check if the current element is greater than x
            if (x < arr[i]) {
                // Update x to the current element
                x = arr[i];

                // Update ans to hold the current maximum element
                ans = arr[i];
            }
        }

        // Print the maximum element in the array
        System.out.print("Max element is: " + ans);
    }
}
