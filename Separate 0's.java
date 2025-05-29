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
        int i = 0; 
        for (int j = 0; j < n; j++) {
            if (arr[j] != 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++;
            }
        }

        System.out.print("Array After: ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
