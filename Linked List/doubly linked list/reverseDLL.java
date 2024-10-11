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
public class reverseDLL {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth = new Node(50);

        // making links
        first.next = second;
        second.prev = first;
        second.next = third;
        third.prev = second;
        third.next = forth;
        forth.prev = third;
        forth.next = fifth;
        fifth.prev = forth;

        Node head = first;
        printListForward(head);
        head = reverse(head); //reversing the linked list

        printListForward(head);
    }


    public static void printListForward(Node node) {
        Node current = node;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static Node reverse(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = null; Node curr = head;
        while (curr!=null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

       // After the loop, 'temp' is at the second last node. The new head is temp.prev
        return temp.prev;
    }
}
