import java.util.Scanner; 

class Main {
    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);

        // Input string to analyze
        System.out.print("Enter the String :" );
        String str = sc.nextLine();
        String result = Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
        
        System.out.println("String with first letter uppercase: " + result);
    }
}
