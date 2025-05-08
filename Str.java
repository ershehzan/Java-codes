import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    //     System.out.println();
   //  Scanner s=new Scanner(System.in);
         
    String str = "shan";  
    
    String result = Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
    
    
    System.out.println("String with first letter uppercase: " + result);
    }
}
