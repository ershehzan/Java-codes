class Main {
    public static void main(String[] args) {
      //  System.out.println("Try programiz.pro");
        
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 1, 2, 3}
        };
        
 System.out.println("2D Array is:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j <4; j++) {
                System.out.print( arr[i][j] + "  ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}
