class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

public class TraverseSimpleLL {
    public static void main(String[] args) {
        
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // making links
        first.next = second;
        second.next = third;

        Node head = first;
        Node curr = head; //done by using a new reference current bcoz if we use our head then it will go to the last node!
        while(curr!=null){
            System.out.print(curr.data + "---->");
            curr = curr.next;
        }
    }
}

