import java.util.Scanner;

public class PowerSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        int n = scanner.nextInt();
        
       int sum = 0;

        for (int i = 1; i <= n; i++) {
            
             sum +=i*i*i; 
              System.out.println(i+"x"+i+"x"+i+"="+sum);
            
            
          
        }
        
        scanner.close();
    }
}
