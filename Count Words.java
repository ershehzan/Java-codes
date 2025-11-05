import java.util.Scanner; // Import the Scanner class for potential user input (currently unused but can be utilized for future enhancements)

class Main {
    public static void main(String[] args) {
        // The predefined input string to count words
        String str = "Hello this is a test string"; // Example string with multiple words

        // Step 1: Trim leading and trailing whitespace from the string
        // Step 2: Split the string into an array of words based on whitespace
        // "\\s+" is a regular expression that matches one or more whitespace characters
        String[] words = str.trim().split("\\s+");
        // Calculate the total number of words by determining the length of the words array
        int wordCount = words.length;

        // Print the total word count to the console
        System.out.println("Number of words: " + wordCount);
    }
}
