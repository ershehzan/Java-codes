import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[3][3];
         int[][] ans = new int[3][3];
    

 System.out.print("Enter the Elements of Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
       
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            ans[j][2 - i] = arr[i][j];
        }
    }

  
        System.out.println("Matrix after 90 degree rotation:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
    
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }

        
    }
}
