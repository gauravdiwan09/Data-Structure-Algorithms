class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
public class deleteKTH {

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
        head = deletek(head,3);
        traverse(head);
        
    }    

    public static Node deletek(Node head, int k){
        if (head==null) {
            return head;
        }

        if (k==1) {
            return deleteH(head);
        }
        Node curr = head;
        for (int i = 0; i < k-2; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return head;
    }

    public static Node deleteH(Node head){
        if (head==null) {
            return null;
        }

        if (head.next==null) {
            return null;
        }

        head.data = head.next.data;
        head.next = head.next.next;

        return head;
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