import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Create a scanner object (not used in this code, but can be used for user input if needed)
        Scanner sc = new Scanner(System.in);

        // Initialize the array to be sorted
        int[] arr = {7, 12, 9, 11, 3};
        int n = arr.length; // Get the length of the array

        // Outer loop: controls the number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: compares adjacent elements and swaps them if needed
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];           // Store current element in temp
                    arr[j] = arr[j + 1];         // Move next element to current position
                    arr[j + 1] = temp;           // Move temp (original current element) to next position
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
