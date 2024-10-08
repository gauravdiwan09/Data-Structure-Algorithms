class Node {
    int data;
    Node next;

    Node(int x) { // constructor!
        data = x;
        next = null;
    }
}

public class InsertAtAnyPosSLL {
    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        // making links
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Node head = first;
        System.out.println("before inserting");
        recursive_traverse(head);

        Node newNode = new Node(25); // node to be inserted
        int position = 1; // inserting at position 1 (1-based index)
        head = insertAtpos(head, newNode, position); // update the head
        System.out.println();
        System.out.println("after inserting");
        recursive_traverse(head);
    }

    static void recursive_traverse(Node curr) {
        if (curr == null) {
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + "---->");
            curr = curr.next;
        }
    }

    static Node insertAtpos(Node head, Node newNode, int pos) {
        if (head == null) {
            return newNode;
        }
        if (pos == 1) {
            newNode.next = head; // point the new node to the current head
            head = newNode; // update head
            return head; // return the new head
        }

        Node curr = head;
        for (int i = 0; i < pos - 2; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
}
