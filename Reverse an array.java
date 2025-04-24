import java.util.Scanner;

// Main class containing the program
class Main {
    public static void main(String[] args) {

        // Create a Scanner object for input (not used in this code)
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize the array to be reversed
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        // Number of elements in the array
        int n = 10;

        // Initialize pointers for the start and end of the array
        int start = 0, end = n - 1;

        // Loop to perform the in-place reversal of the array
        while (start < end) {
            // Swap the elements at the start and end indices
            int a = arr[start];
            arr[start] = arr[end];
            arr[end] = a;

            // Move the start pointer forward
            start++;

            // Move the end pointer backward
            end--;
        }

        // Print the reversed array
        System.out.print("Reversed Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
