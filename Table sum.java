import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
            int sum=0;
        int i=1;
        while (i <=10){
            
            int pro=i*n;
            System.out.println(pro);
            
            sum+=pro;
            i++;
        }
        System.out.println(sum);
    }
    
}
