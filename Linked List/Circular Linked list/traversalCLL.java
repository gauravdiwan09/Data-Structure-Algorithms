class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}


public class traversalCLL {

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