public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 12, 9, 22, 45, 7};
        int n = arr.length;

        // Bubble sort to sort the array
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
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
