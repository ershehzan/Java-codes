import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Enter the number: "); 
        // int n = scanner.nextInt(); 

int []arr={1,2,3,4,5,6,7,8,9,11};
int n=10;
int x=0;
int ans=0;

for(int i=0;i<n;i++){
    if(x<i){
         //System.out.print("Max element is: "+i); 
         ans=arr[i];
    }
}
System.out.print("Max element is: "+ans); 
        
        
//  System.out.print("Reversed Array is: "); 
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i]+" "); 
//         }
    }
}
