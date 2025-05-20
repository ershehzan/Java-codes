import java.util.Scanner; // Import the Scanner class for user input

// Main class
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        
        // Initialize the array to be searched
        int[] arr = {5, 2, 9, 12};
       
        System.out.print("Enter the Key:"); // Prompt user for the key to search
        int key = sc.nextInt(); // Read the key value from user
        
        // Loop through the array to search for the key
        for (int i = 0; i < 4; i++) {
            if (arr[i] == key) { // If key is found at index i
                System.out.println("Found at index: " + i);
            }
        }
        // This message will always print, even if the key is found
        System.out.println("Not present in Array");
    }
}
