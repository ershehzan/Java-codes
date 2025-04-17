import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        System.out.print("Enter the Number:");
        Scanner sn=new Scanner(System.in);
        
        int n= sn.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i*i+" ");
            }
             System.out.println(" ");
        }
       
        
    }
}
