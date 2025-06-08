import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 4, 2, 3, 1, 5};

        // Convert array to set to remove duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Convert set back to array
        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueArr[i++] = num;
        }

        // Print result
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }
}
