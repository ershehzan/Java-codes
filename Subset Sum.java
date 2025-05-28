/**
 * This program finds the maximum sum possible from any subset of three different elements
 * in an integer array, and counts the total number of such subsets.
 * 
 * It demonstrates basic array manipulation, nested loops, and tracking of aggregate results.
 */
public class Main {
    /**
     * The main method executes the subset sum logic.
     * @param args Command-line arguments (not used here)
     */
    public static void main(String[] args) {
        // Initialize the input array of integers.
        int[] arr = {3,8,10,7,5,2,20,1};
        int n = arr.length; // Store the length of the array for reuse.
        int count = 0; // Counter for the number of subsets of size 3.
        int MaxSum = Integer.MIN_VALUE; // Track the maximum subset sum found.

        // Use three nested loops to generate all unique subsets of size 3.
        for (int i = 0; i < n; i++) { // First element of the subset
            for (int j = i + 1; j < n; j++) { // Second element, after the first
                for (int k = j + 1; k < n; k++) { // Third element, after the second
                    // Calculate the sum of the current subset of three elements.
                    int sum = arr[i] + arr[j] + arr[k];
                    count++; // Increment the subset counter.

                    // If this sum is greater than the current maximum, update MaxSum.
                    if (sum > MaxSum) {
                        MaxSum = sum;
                    }
                }
            }
        }
        
        // Output the total number of 3-element subsets considered.
        System.out.println("Number of subsets is: " + count);

        // Output the maximum sum found among all subsets.
        System.out.println("The Max subset sum is: " + MaxSum);
    }
}
