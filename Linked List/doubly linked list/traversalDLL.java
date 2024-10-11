class Node {
    int data;  // Make data, prev, next public or provide getters/setters
    Node prev;
    Node next;

    Node(int d) {
        this.data = d;
        this.prev = null;
        this.next = null;
    }
}

public class traversalDLL {
    public static void main(String[] args) {
        // Create nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);

        // Link nodes to form a doubly linked list
        first.next = second;
        second.prev = first;
        second.next = third;
        third.prev = second;
        third.next = forth;
        forth.prev = third;
        forth.next = fifth;
        fifth.prev = forth;

        // Traverse the list from the first node
        System.out.println("Forward Traversal:");
        printListForward(first);

        // Traverse the list from the last node (for demonstration)
        System.out.println("Backward Traversal:");
        printListBackward(fifth);
    }

    // Method to print the list forward
    public static void printListForward(Node node) {
        Node current = node;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to print the list backward (from the end)
    public static void printListBackward(Node node) {
        Node current = node;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}