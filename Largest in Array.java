// Main class containing the entry point of the program
public class Main {
    public static void main(String[] args) {
        // Initialize the array with some integer values
        int[] arr = {4, 5, 9, 12, 9, 22, 45, 7};
        // Get the length of the array and store it in 'n'
        int n = arr.length;

        // Bubble sort algorithm to sort the array in ascending order
        for (int i = 0; i < n - 1; i++) {            // Outer loop for each pass
            for (int j = 0; j < n - i - 1; j++) {    // Inner loop for comparing adjacent elements
                if (arr[j] > arr[j + 1]) {           // If current element is greater than next, swap them
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // After sorting, the largest element will be at the last index
        System.out.println("Largest Element is: " + arr[n - 1]);
    }
}
