public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,9,12,9,22,45,7};
        int n = arr.length;

        int maxCount = 0;
        int mostFrequent = arr[0];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }
        System.out.println("Most Frequent Element: " + mostFrequent);
    }
}
