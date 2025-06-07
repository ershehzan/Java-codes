import java.util.Arrays;

// Class to demonstrate the Insertion Sort algorithm
public class InsertionSort {

    /**
     * Sorts the given array in ascending order using the Insertion Sort algorithm.
     * This method modifies the input array in place.
     *
     * @param arr the array of integers to be sorted
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Traverse the array starting from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i];      // Store the current element to be compared
            int j = i - 1;         // Initialize j to the index before i

            // Move elements of arr[0..i-1], that are greater than key,
            // one position ahead to make space for the key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];   // Shift element to the right
                j--;                   // Move to the previous element
            }

            // Insert the key into its correct position in the sorted subarray
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Example input array to be sorted
        int[] arr = {12, 11, 13, 5, 6};

        // Call insertionSort to sort the array
        insertionSort(arr);

        // Print the sorted array
        System.out.println("Sorted array using Insertion Sort:");
        System.out.println(Arrays.toString(arr));
    }
}
