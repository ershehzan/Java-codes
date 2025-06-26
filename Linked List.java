public class Main {

    // Definition for a singly-linked list node
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int value) {
            data = value;
            next = null;
        }
    }

    // Recursive function to create a linked list from an array
    static Node insertAtEnd(int[] arr, int index, int size) {
        // Base case
        if (index == size)
            return null;

        // Create new node and recursively link
        Node temp = new Node(arr[index]);
        temp.next = insertAtEnd(arr, index + 1, size);
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50};
        int size = arr.length;

        // Build list recursively
        Node head = insertAtEnd(arr, 0, size);

        // Print the linked list
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
