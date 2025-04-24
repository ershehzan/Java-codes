import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Enter the number: "); 
        // int n = scanner.nextInt(); 

int []arr={1,2,3,4,5,6,7,8,9,11};
int n=10;
 int start=0,end=n-1;

while(start<end){
    int a=arr[start];
    arr[start]=arr[end];
    arr[end]=a;
    
    start++;
    end--;
}
 System.out.print("Reversed Array is: "); 
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" "); }
        
//  System.out.print("Reversed Array is: "); 
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i]+" "); 
//         }
    }
}
