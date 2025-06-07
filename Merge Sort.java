import java.util.Arrays;

// Class to demonstrate the Merge Sort algorithm
public class MergeSort {

    /**
     * Merges two sorted subarrays of arr[] into a single sorted subarray.
     * The first subarray is arr[start..mid], the second subarray is arr[mid+1..end].
     *
     * @param arr   The main array containing the subarrays to be merged
     * @param start Starting index of the first subarray
     * @param mid   Ending index of the first subarray and one less than starting index of the second
     * @param end   Ending index of the second subarray
     */
    public static void merge(int[] arr, int start, int mid, int end) {
        // Calculate the sizes of the two subarrays to be merged
        int n1 = mid - start + 1; // Length of left subarray
        int n2 = end - mid;       // Length of right subarray

        // Create temporary arrays to hold the elements of the subarrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data into temporary left and right arrays
        for (int i = 0; i < n1; i++)
            left[i] = arr[start + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        // Initial indexes for left, right, and merged subarrays
        int i = 0, j = 0, k = start;

        // Merge the left and right arrays back into arr[]
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++]; // Take from left if smaller or equal
            } else {
                arr[k++] = right[j++]; // Take from right otherwise
            }
        }

        // Copy any remaining elements in left[] (if any)
        while (i < n1) {
            arr[k++] = left[i++];
        }

        // Copy any remaining elements in right[] (if any)
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    /**
     * Recursively sorts the array using Merge Sort algorithm.
     *
     * @param arr   The array to be sorted
     * @param start Starting index of the array/subarray to be sorted
     * @param end   Ending index of the array/subarray to be sorted
     */
    public static void mergeSort(int[] arr, int start, int end) {
        // Base case: if the subarray has one or zero elements, it's already sorted
        if (start >= end)
            return;

        // Find the mid-point to divide the array into two halves
        int mid = start + (end - start) / 2;

        // Recursively sort the first and second halves
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        // Merge the sorted halves
        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        // Example input array to be sorted
        int[] arr = {12, 11, 13, 5, 6, 7, 34, 56, 82, 10};

        // Print the original array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        // Call mergeSort to sort the array
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}
