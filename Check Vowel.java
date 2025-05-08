import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    //     System.out.println();
   //  Scanner s=new Scanner(System.in);
         
    String str = "aeiou";  // Input string
    int index = 0;
    int count = 0;
    
    // Loop through each character in the string
    for (int i = 0; i < str.length(); i++) {
        // Check if the character is a vowel
        if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i' || str.charAt(index) == 'o' || str.charAt(index) == 'u') {
            count++;
        }
        index++;
    }
        
    System.out.println("Number of Vowels are: " + count);
    }
}
