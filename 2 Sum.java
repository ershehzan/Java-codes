import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Initialize a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Define an array of integers
        int[] arr = {3, 4, 6, 8, 11, 12, 34, 41}; // Array to store elements
        int n = arr.length; // Determine the length of the array

        // Prompt the user to input the target sum
        System.out.print("Enter the target: ");
        int target = sc.nextInt(); // Read the target value from the user

        // Initialize two pointers: start (beginning of the array) and end (last element of the array)
        int start = 0, end = n - 1;

        // Two-pointer approach to find a pair of elements that sum up to the target
        while (start < end) {
            int sum = arr[start] + arr[end]; // Calculate the sum of elements at the start and end pointers

            // If the sum matches the target, print the pair and their indices
            if (sum == target) {
                System.out.print("Pair found :[" + arr[start] + ", " + arr[end] + "]");
                System.out.println("\nPair found at Index : [" + start + ", " + end + "]");
                return; // Exit the program as the solution is found
            } 
            // If the sum is greater than the target, decrement the end pointer to reduce the sum
            else if (sum > target) {
                end--;
            } 
            // If the sum is less than the target, increment the start pointer to increase the sum
            else {
                start++;
            }
        }

        // If no matching pair is found, print a message indicating no match
        System.out.println("No Match ");
    }
}
