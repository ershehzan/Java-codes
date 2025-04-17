import java.util.Scanner;
class Main {
    public static void main(String[] s) {
        
        System.out.print("Enter the Number:");
        Scanner sn=new Scanner(System.in);
        
        int n= sn.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
             System.out.println(" ");
        }
       
        
    }
}
