
import java.util.Scanner; // Importing the Scanner class for potential user input (currently unused)

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string to analyze
        System.out.print("Enter the String :" );
        String str = sc.nextLine();
        // Step 2: Initialize two pointers
        int start = 0; // Pointer to the beginning of the string
        int end = str.length() - 1; // Pointer to the end of the string

        // Step 3: Use a while loop to check characters from both ends
        while (start < end) {
            // Step 4: Compare characters at 'start' and 'end' positions
            if (str.charAt(start) != str.charAt(end)) {
                // If a mismatch is found, the string is not a palindrome
                System.out.println("Not a Palindrome");
                return; // Exit the program as we already know the result
            }

            // Step 5: Move the pointers closer to the center
            start++; // Increment the 'start' pointer
            end--;   // Decrement the 'end' pointer
        }

        // Step 6: If the loop completes without mismatches, the string is a palindrome
        System.out.println("String is Palindrome");
    }
}
