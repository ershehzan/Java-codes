import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // Initialize a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        // Define an array of integers
        int[] arr = {3, 4, 6, 8, 11, 12, 34, 41}; // Array to store elements
        int n = arr.length; // Get the length of the array

        // Prompt the user to input the target sum
        System.out.print("Enter the target: ");
        int target = sc.nextInt(); // Read the target value from the user

        // Sort the array to enable the two-pointer approach (Optional if the array is already sorted)
        Arrays.sort(arr);

        // Iterate through the array to fix the first element of the triplet
        for (int i = 0; i < n - 2; i++) { // Loop stops at n-2 because we need at least 3 elements for a triplet
            int start = i + 1; // Pointer to the element next to the fixed element
            int end = n - 1;   // Pointer to the last element of the array

            // Two-pointer approach to find the other two elements of the triplet
            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end]; // Calculate the sum of the triplet
                // If the sum matches the target, print the triplet and their indices
                if (sum == target)
                {
                    System.out.println("Triplet found: [" + arr[i] + ", " + arr[start] + ", " + arr[end] + "]");
                    System.out.println("Triplet index: [" + i + ", " + start + ", " + end + "]");
                    sc.close(); // Close the Scanner before exiting
                    return; // Exit the program after finding the first triplet
                } 
                // If the sum is greater than the target, move the end pointer left to decrease the sum
                else if (sum > target) {
                    end--;
                } 
                // If the sum is less than the target, move the start pointer right to increase the sum
                else
                {
                    start++;
                }
            }
        }

        // If no triplet is found, print a message indicating no match
        System.out.println("No Triplet Match");
    }
}
