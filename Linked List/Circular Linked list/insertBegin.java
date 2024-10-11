class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}


public class insertBegin {

    public static void main(String[] args) {
        
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // making links
        first.next = second;
        second.next = third;
        third.next = first; //circular linked list

        Node head = first;
        traverse(head);
        System.out.println();
        head = insert(head, 5);
        traverse(head);
        
    }    

    public static Node insert(Node head, int x){
        Node temp = new Node(x);
        if (head==null) {
            temp.next = temp;
            return temp;
        }

        Node curr = head;
        while (curr.next!=head) {
            curr = curr.next;
        }

        curr.next = temp;
        temp.next = head;

        return temp;
    }

    public static void traverse(Node head){
        if (head==null) {
            return;
        }
        System.out.print(head.data + " ");
        Node r = head.next;
        while (r!=head) {
            System.out.print(r.data + " ");
            r = r.next;
        }

    }
}