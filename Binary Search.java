import java.util.Scanner; // Import the Scanner class for user input

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user

        // Initialize a sorted array of integers to perform binary search on
        int[] arr = {3, 12, 22, 91};
        int n = arr.length; // Store the length of the array

        System.out.print("Enter the Key: "); // Prompt the user to enter the value to search for
        int key = sc.nextInt(); // Read the integer input from the user

        int start = 0, end = n - 1; // Initialize the start and end indices for the search range

        // Perform binary search
        while (start <= end) { // Continue searching while the range is valid
            int mid = start + (end - start) / 2; // Calculate the middle index to avoid integer overflow

            if (arr[mid] == key) { // If the key is found at the mid index
                System.out.println("Element found at index: " + mid); // Output the index where the key was found
                return; // Exit the program since the key is found
            } else if (arr[mid] < key) { // If the key is greater than the mid element
                start = mid + 1; // Move the start index to mid + 1 to search in the right half
            } else { // If the key is less than the mid element
                end = mid - 1; // Move the end index to mid - 1 to search in the left half
            }
        }

        // If the loop completes, the key was not found in the array
        System.out.println("Not in Array"); // Inform the user that the key is not present
    }
}
