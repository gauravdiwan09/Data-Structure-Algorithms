class Node{
    int data;
    Node next;

    Node(int x){ //constructor!
        data = x;
        next = null;
    }
}
public class searchRecursive {

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
        int index = search(head,40);
        System.out.println("the index is " + index);
    } 
    
    static int search(Node curr,int value){
        if (curr == null) {
            return -1;
        }
        if (curr.data == value ) {
            return 1;
        }
        else{
            int res = search(curr.next, value);
            if (res==-1) return -1;
            else return (res+1);
        }
    }
}
