import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
            
        int i=1;
        while (i <=10){
            
          
            System.out.println(n+"x"+i+"="+i*n);
            
        
            i++;
        }
     
    }
    
}
