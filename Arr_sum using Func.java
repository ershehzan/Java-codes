import java.util.Scanner;

public class Main {
    static int Arr_sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the index: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = Arr_sum(arr);
        System.out.println("The sum of the array elements is: " + sum);
    }
}
