import java.util.*; // Import the necessary Java utilities, including Set, LinkedHashSet, and Arrays

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Initialize the input array with some duplicate values
        int[] arr = {4, 5, 2, 4, 2, 3, 1, 5};

        // Step 1: Remove duplicates by adding elements to a Set
        // LinkedHashSet is used here to maintain the original insertion order of elements
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num); // Only unique elements are stored in the set; duplicates are ignored
        }

        // Step 2: Convert the Set back to an array
        int[] uniqueArr = new int[set.size()]; // Create an array with the same size as the set
        int i = 0;
        for (int num : set) {
            uniqueArr[i++] = num; // Copy each unique element into the array
        }

        // Step 3: Print the resulting array without duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }
}
