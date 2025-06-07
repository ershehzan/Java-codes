import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Move the boundary of unsorted subarray one by one
        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum is at i
            int minIndex = i;

            // Find the index of the minimum element in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

        selectionSort(arr);

        System.out.println("Sorted array using Selection Sort:");
        System.out.println(Arrays.toString(arr));
    }
}
