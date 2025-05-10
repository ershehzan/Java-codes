import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {3, 4, 6, 8, 11, 12, 34, 41}; // Array to store elements
        int n = arr.length;

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        // Sort the array (optional if the array is already sorted)
        Arrays.sort(arr);

        // Fix the first element
        for (int i = 0; i < n - 2; i++) {
            int start = i + 1; // Next element after i
            int end = n - 1;   // Last element

            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];

                if (sum == target) {
                    System.out.println("Triplet found: [" + arr[i] + ", " + arr[start] + ", " + arr[end] + "]");
                    System.out.println("Triplet index: [" + i + ", " + start + ", " + end + "]");
                    sc.close(); // Close the scanner before exiting
                    return; // Exit after finding the first triplet
                } else if (sum > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        // This line is only reached if no triplet is found
        System.out.println("No Triplet Match");

    }
}
