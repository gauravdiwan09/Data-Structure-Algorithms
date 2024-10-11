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
public class creationDLL {
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
    }
}