import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
   

int []arr={1,2,3,4,5,6,7,8,9,11};
int n=10;
int sum=0;

for(int i=0;i<n;i++){
   sum+=arr[i];
}
System.out.print("Sum of Array Element is: "+sum); 
        
        

    }
}
