import java.util.Scanner; // Importing the Scanner class for potential user input (currently unused)

class Main {
    public static void main(String[] args) {
        // Step 1: Define an input string
        String str = "shan"; // Predefined string to demonstrate the conversion of the first character to uppercase

        // Step 2: Convert the first character to uppercase and the rest to lowercase
        // Character.toUpperCase(str.charAt(0)) converts the first character of the string to uppercase
        // str.substring(1).toLowerCase() converts the rest of the string (from index 1 onward) to lowercase
        String result = Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();

        // Step 3: Print the formatted string
        System.out.println("String with first letter uppercase: " + result);
    }
}
