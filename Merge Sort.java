import java.util.Arrays;

public class MergeSort {

    // Merge two sorted subarrays into a single sorted array
    public static void merge(int[] arr, int start, int mid, int end) {
        // Calculate the sizes of two subarrays to be merged
        int n1 = mid - start + 1;
        int n2 = end - mid;

        // Create temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            left[i] = arr[start + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        // Merge the temporary arrays

        int i = 0, j = 0, k = start;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left[] if any
        while (i < n1) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right[] if any
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    // Recursive merge sort function
    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int mid = start + (end - start) / 2;

        // Sort first and second halves
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        // Merge sorted halves
        merge(arr, start, mid, end);
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7, 34, 56, 82, 10};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}
