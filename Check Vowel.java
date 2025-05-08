import java.util.Scanner; // Import the Scanner class for potential user input (currently unused)

class Main {
    public static void main(String[] args) {
        // Define the input string to check for vowels
        String str = "aeiou"; // Input string containing characters to analyze
        int index = 0; // Initialize an index to iterate through the string
        int count = 0; // Initialize a counter to count the number of vowels

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the character at the current index is a vowel
            // This condition checks for lowercase vowels: 'a', 'e', 'i', 'o', 'u'
            if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i' || str.charAt(index) == 'o' || str.charAt(index) == 'u') {
                count++; // Increment the vowel counter if a vowel is found
            }
            index++; // Move to the next character in the string
        }

        // Output the total number of vowels found in the input string
        System.out.println("Number of Vowels are: " + count);
    }
}
