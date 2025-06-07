import java.util.Arrays;

public class QuickSort {

    // Partition function using Lomuto partition scheme
    public static int partition(int[] arr, int start, int end) {
        int pos = start;
        int pivot = arr[end];

        for (int i = start; i <= end; i++) {
            if (arr[i] <= pivot) {
                // Swap arr[i] with arr[pos]
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }

        return pos - 1; // Return final pivot index
    }

    // Recursive QuickSort function
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int pivotIndex = partition(arr, start, end);

        // Left side of pivot
        quickSort(arr, start, pivotIndex - 1);
        // Right side includes pivot as per your logic
        quickSort(arr, pivotIndex, end);
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 11, 12, 2, 14, 3};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
