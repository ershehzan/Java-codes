import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    //     System.out.println();
   //  Scanner s=new Scanner(System.in);
    String str = "NAMAN"; 
    
    int start = 0;  
    int end = str.length() - 1;  
    
    while (start < end) {
        
        if (str.charAt(start) != str.charAt(end)) {
            System.out.println("Not a Palindrome"); 
            return;  
        }
        
        start++;
        end--;
    }
    
    System.out.println("String is Palindrome"); 
    }
}
