import java.util.Scanner; // Import the Scanner class

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string to analyze
        String str = sc.nextLine(); // Reads the entire line of input

        int count = 0; // Counter for vowels

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            // Check if the character is a vowel (both lower and uppercase)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        // Output the result
        System.out.println("Number of Vowels are: " + count);
    }
}
