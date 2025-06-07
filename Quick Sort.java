import java.util.Arrays;

// Class to demonstrate the Quick Sort algorithm
public class QuickSort {

    /**
     * Partitions the array using the Lomuto partition scheme.
     * Elements less than or equal to the pivot are moved to the left of the pivot,
     * and elements greater than the pivot are moved to the right.
     *
     * @param arr   The array to be partitioned
     * @param start The starting index of the segment to partition
     * @param end   The ending index (pivot element) of the segment to partition
     * @return      The final position of the pivot element
     */
    public static int partition(int[] arr, int start, int end) {
        int pos = start;         // Position for the next smaller element
        int pivot = arr[end];    // Pivot element chosen as the last element

        // Traverse the segment and swap elements as needed
        for (int i = start; i <= end; i++) {
            if (arr[i] <= pivot) {
                // If current element is less than or equal to pivot,
                // swap it to the 'pos' location
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++; // Move the position forward
            }
        }

        // Return the final index where the pivot is placed
        return pos - 1;
    }

    /**
     * Recursively sorts the subarrays of arr[] using the Quick Sort algorithm.
     *
     * @param arr   The array to be sorted
     * @param start The starting index of the subarray
     * @param end   The ending index of the subarray
     */
    public static void quickSort(int[] arr, int start, int end) {
        // Base case: if the subarray has one or zero elements, it's already sorted
        if (start >= end)
            return;

        // Partition the array and get the pivot index
        int pivotIndex = partition(arr, start, end);

        // Recursively sort the elements before and after partition
        quickSort(arr, start, pivotIndex - 1); // Left side of pivot
        quickSort(arr, pivotIndex, end);       // Right side (including pivot as per this logic)
    }

    public static void main(String[] args) {
        // Example input array to be sorted
        int[] arr = {9, 7, 5, 11, 12, 2, 14, 3};

        // Call quickSort to sort the array
        quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
