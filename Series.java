import java.util.Scanner;

public class PowerSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        int n = scanner.nextInt();
        
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            
            sum +=1.0/Math.pow(i,i); 
        }

        System.out.printf("The sum of the series are;" +sum);
        
        scanner.close();
    }
}
