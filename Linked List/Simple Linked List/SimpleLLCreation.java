class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}


public class SimpleLLCreation {

    public static void main(String[] args) {
        
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // making links
        first.next = second;
        second.next = third;

        Node head = first;
        while(head!=null){
            System.out.print(head.data + "---->");
            head = head.next;
        }
    }    
}