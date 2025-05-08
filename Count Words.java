import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    //     System.out.println();
   //  Scanner s=new Scanner(System.in);
         
    String str = "Hello this is a test string"; 
    
 
    String[] words = str.trim().split("\\s+");

    int wordCount = words.length;
    
    System.out.println("Number of words: " + wordCount);
    }
}
