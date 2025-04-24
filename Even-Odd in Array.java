import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
          // System.out.print("Enter the number: "); 
        // int n = scanner.nextInt(); 

        int []arr={1,2,3,4,5,6,7,8,9,11};
        int n=10;
        int even=0,odd=0;
    
                for (int i = 0; i < n; i++) {
                    if(i%2==0){
              even++;
                        }
                else{
                odd++;
                        }
                         }
   System.out.print("Even Array Elements;"+even+" ");
        System.out.print("\nOdd Array Elements;"+odd+" ");

    }
}
