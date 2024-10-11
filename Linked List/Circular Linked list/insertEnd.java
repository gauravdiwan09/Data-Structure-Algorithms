class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}


public class insertEnd {

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
        head = insert(head, 15);
        traverse(head);
        
    }    

    public static Node insert(Node head, int x){
        Node temp = new Node(x);
        if (head==null) {
            temp.next = temp;
            return temp;
        }

        temp.next = head.next;
        head.next = temp;
        int t = head.data; //swapping code...
        head.data = temp.data;
        temp.data = t;

        // head = head.next; //think about it!
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