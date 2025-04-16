import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
            int fact=1;
        int i=1;
        while (i <=n){
    
           fact*=i;
            i++;
        }
        System.out.println("factorial of the number "+ n + " is: "+fact);
    }
    
}
