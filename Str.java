import java.util.Scanner; // Importing the Scanner class to take input from the user

class Main {
    public static void main(String[] args) {
       
        // Creating a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in); 

        // Prompting the user to input a string for analysis
        System.out.print("Enter the String: ");
        
        // Reading the full line of input from the user
        String str = sc.nextLine();

        // Transforming the string:
        // - Convert the first character of the string to uppercase
        // - Convert the rest of the string to lowercase
        String result = Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
        
        // Displaying the transformed string
        System.out.println("String with first letter uppercase: " + result);
    }
}
