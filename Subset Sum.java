public class Main {
    public static void main(String[] args) {
      
        int[] arr = {3,8,10,7,5,2,20,1};
        int n = arr.length;
        int count=0;
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                  
                    int sum = arr[i] + arr[j] + arr[k];
                    count++;

                    if (sum > MaxSum) {
                        MaxSum = sum;
                    }
                }
            }
        }
        
          System.out.println("Number of sunset is: " + count);

        System.out.println("The Max subset sum is: " + MaxSum);
    }
}
