import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
            int sum=0;
        int i=1;
        while (i <=10){
            
          int pro=i*n;
            System.out.println(n+"x"+i+"="+i*n);
            sum+=pro;
        
            i++;
        }
       System.out.println("Sum of Table is:"+sum);
    }
    
}
