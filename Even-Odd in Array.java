
// Main class containing the program
class Main {
    public static void main(String[] args) {

        // Example hardcoded array of integers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        // Number of elements in the array
        int n = 10;

        // Variables to count even and odd numbers
        int even = 0, odd = 0;

        // Loop through the array to count even and odd numbers
        for (int i = 0; i < n; i++) {
            // Check if the current index is even
            if (i % 2 == 0) {
                even++; // Increment the even counter
            } else {
                odd++; // Increment the odd counter
            }
        }

        // Print the count of even numbers
        System.out.print("Even Array Elements: " + even + " ");

        // Print the count of odd numbers
        System.out.print("\nOdd Array Elements: " + odd + " ");
    }
}
