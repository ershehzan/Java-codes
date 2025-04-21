import java.util.Scanner;
class Main {
    public static void main(String[] s) {
        
        System.out.print("Enter the Number:");
        Scanner sn=new Scanner(System.in);
        
        int n= sn.nextInt();
        int temp=1;
        
        for(int i=1; i<=n; i++)
        {
            for(int j=i; j<n; j++)
            {
                System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++)
            {
                System.out.print(temp+" ");
                temp++;
            }
            
            System.out.println();
        }
    }
}
