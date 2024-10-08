class Node{
    int data;
    Node next;

    Node(int x){ //constructor!
        data = x;
        next = null;
    }
}


public class InserAtEndSLL {

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
        
        //calling recursive function for traversing by passing head!
        Node head = first;
        System.out.println("before inserting node at the end!");
        recursive_traverse(head);

        Node zeroth = new Node(60); //creating a new node that to be inserted at the beginning.
        // InsertAtBeginning(head, zeroth);
        InsertAtEnd(head, zeroth); //inserting at the end!
        System.out.println();
        System.out.println("after inserting node at the end!");
        recursive_traverse(head);
    } 
    
    static void recursive_traverse(Node curr){
        if (curr==null) {
            return;
        }
        while (curr!=null) {
            System.out.print(curr.data + "---->");
            curr = curr.next;
        }
    }

    // static void InsertAtBeginning(Node head, Node zeroth){
    //     Node new_point = zeroth;
    //     new_point.next = head;
    //     head = zeroth;
        // System.out.println();
        // System.out.println("after inserting node at the beginning!");
        // recursive_traverse(head);
    // }

    static void InsertAtEnd(Node curr, Node last){
        while (curr.next!=null) {
            curr = curr.next;
        }
        curr.next = last;
    }
}