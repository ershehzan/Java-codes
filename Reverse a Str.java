import java.util.Scanner; // Importing the Scanner class for potential user input (currently unused but can be utilized for dynamic input in the future)

class Main {
    public static void main(String[] args) {
        // Step 1: Define the input string to be reversed
        String str = "PIEMR"; // Predefined string to demonstrate reversing functionality

        // Step 2: Print a message indicating the result
        System.out.print("String after reversed:"); // Message to inform the user about the reversed string

        // Step 3: Loop through the string in reverse order
        // The loop starts from the last character (str.length() - 1) 
        // and continues until the first character, decrementing the index (i) in each iteration
        for (int i = str.length() - 1; i >= 0; i--) {
            // Print each character of the string in reverse order
            System.out.print(str.charAt(i));  
        }

        // Step 4: Print a newline at the end for cleaner output
        System.out.println();  
    }
}
