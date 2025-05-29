import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            // Positions are 1-based: i+1
            if ((i + 1) % 2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }

        int diff = Math.abs(even - odd);
        System.out.print("Output: " + diff);
    }
}
