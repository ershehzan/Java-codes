import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input: Elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input: Difference k
        System.out.print("Enter the difference: ");
        int k = sc.nextInt();

        // Two pointer approach to find the pair with difference k
        int i = 0, j = 1;
        boolean found = false;

        while (i < n && j < n) {
            if (i != j && arr[j] - arr[i] == k) {
                System.out.println("Pair found at index [" + i + " and " + j + "]");
                found = true;
                break;
            } else if (arr[j] - arr[i] < k) {
                j++;
            } else {
                i++;
            }
        }

        if (!found) {
            System.out.println("Pair not found");
        }

        sc.close();
    }
}
