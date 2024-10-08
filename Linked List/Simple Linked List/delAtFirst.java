class Node {
    int data;
    Node next;

    Node(int x) { // constructor!
        data = x;
        next = null;
    }
}
public class delAtFirst {

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
        System.out.println("before deleting first node!");
        recursive_traverse(head);
        System.out.println();
        System.out.println("After deleting first node!");
        head = deletionOfFirstNode(head);
        recursive_traverse(head);

}

static Node deletionOfFirstNode(Node curr) {
    if (curr == null) {
        return curr;
    }

    curr = curr.next;
    return curr; 
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
}
