import java.util.Scanner;
// Main class containing the program logic
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Step 2: Declare the array of size 'n'
        int[] arr = new int[n];

        // Step 3: Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element from user
        }

        // Step 4: Input the required difference 'k'
        System.out.print("Enter the difference: ");
        int k = sc.nextInt();

        // Step 5: Initialize two pointers for the search
        // 'i' and 'j' are used to traverse the array and find a pair with the given difference
        int i = 0, j = 1;
        boolean found = false; // Flag to check if such a pair exists

        // Step 6: Use a two-pointer technique to find the pair
        // Loop continues as long as both pointers are within array bounds
        while (i < n && j < n) {
            // Ensure pointers are not pointing to same element and check if difference matches 'k'
            if (i != j && arr[j] - arr[i] == k) {
                System.out.println("Pair found at index [" + i + " and " + j + "]");
                found = true;
                break; // Exit loop if pair is found
            }
            else if (arr[j] - arr[i] < k) {
                // If current difference is less than 'k', move the 'j' pointer forward to increase the difference
                j++;
            } 
            else {
                // If current difference is greater than or equal to 'k', move 'i' forward to decrease the difference
                i++;
            }
        }

        // Step 7: Output result if pair was not found
        if (!found) {
            System.out.println("Pair not found");
        }

        // Step 8: Close the scanner to prevent resource leak
        sc.close();
    }
}
