import java.util.Arrays;

// Main class for demonstrating Selection Sort
public class SelectionSort {

    // Method to perform selection sort on an integer array
    public static void selectionSort(int[] arr) {
        int n = arr.length;  // Get the length of the array

        // One by one move the boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Assume the first unsorted element is the minimum
            int minIndex = i;

            // Traverse the unsorted part of the array to find the actual minimum element
            for (int j = i + 1; j < n; j++) {
                // Update minIndex if a smaller element is found
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            // Only do the swap if a new minimum was found
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method to test the selectionSort method
    public static void main(String[] args) {
        // Example array to be sorted
        int[] arr = {29, 10, 14, 37, 13};

        // Call selectionSort to sort the array
        selectionSort(arr);

        // Print the sorted array
        System.out.println("Sorted array using Selection Sort:");
        System.out.println(Arrays.toString(arr));
    }
}
