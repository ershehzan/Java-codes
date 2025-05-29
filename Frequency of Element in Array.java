// Main class containing the entry point of the program
public class Main {
    public static void main(String[] args) {
        // Initialize the array with predefined elements
        int[] arr = {4, 5, 9, 12, 9, 22, 45, 7};
        // Store the length of the array for easy reference
        int n = arr.length;

        // Variables to keep track of the maximum frequency and the most frequent element found so far
        int maxCount = 0;           // Stores the highest count of any element
        int mostFrequent = arr[0];  // Stores the element with the highest count; initialized to the first element

        // Outer loop to pick each element in the array one by one
        for (int i = 0; i < n; i++) {
            int count = 0; // Counter to store frequency of arr[i]

            // Inner loop to compare the selected element with all other elements
            for (int j = 0; j < n; j++) {
                // If a match is found, increment the counter
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Update maxCount and mostFrequent if the current element occurs more times than previous elements
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }
        // Output the most frequent element in the array
        System.out.println("Most Frequent Element: " + mostFrequent);
    }
}
