import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int []arr={5,2,9,12};
       
        System.out.print("Enter the Key:");
        int key=sc.nextInt();
        
        for(int i=0;i<4;i++){
            
            if(arr[i]==key){
                System.out.println("Found at index;"+i);
            }
        }
        System.out.println("Not present in Array");
        
    }
}
