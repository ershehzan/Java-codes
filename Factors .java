import java.util.Scanner;

public class PowerSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        int n = scanner.nextInt();
        
    

        for (int i = 1; i <= n; i++) {
            
            if(n%i==0){
                  System.out.print(i+" ");
            }
            
            
            
        }
    }
}
