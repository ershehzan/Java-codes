import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 3, 5};
        int n=6;
        int target = 3;
        int count = 0;
        int oddCount = 0;

        for (int i=0;i<n;i++) {
            if (i == target) {
                count++;
            }
            if (i % 2 != 0) {
                oddCount++;
            }
        }

        System.out.println(target + " appears " + count + " times");
        System.out.println("Odd digits: " + oddCount);
    }
}
