import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     

        Scanner sc = new Scanner(System.in);

        int[] arr = {3, 4, 6, 8, 11, 12, 34, 41}; // Array to store elements
        int n = arr.length;

        System.out.print("Enter the target: ");
        int target = sc.nextInt(); 

        int start = 0, end = n - 1;

        // Two-pointer approach to find pairs that sum up to the target
        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum == target) {
                System.out.print("Pair found :[" + arr[start] + ", " + arr[end] + "]");
                System.out.println("\nPair found at Index : [" + start + ", " + end + "]");
                return; // Use return without 0 to exit early
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println("No Match ");
    }
}
