import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {3, 12, 22, 91};
        int n = arr.length;

        System.out.print("Enter the Key: ");
        int key = sc.nextInt();

        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Not in Array");
    }
}
