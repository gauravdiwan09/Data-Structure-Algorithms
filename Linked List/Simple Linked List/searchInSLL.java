class Node{
    int data;
    Node next;

    Node(int x){ //constructor!
        data = x;
        next = null;
    }
}
public class searchInSLL {

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
        int index = search(head,5);
        System.out.println("the index is " + index);
    } 
    
    static int search(Node curr,int value){
        int count = 0;
        while (curr!=null) {
            count++;
            if (curr.data == value) {
                return count;
            }
            curr = curr.next;
        }
        return -1;
    }
}
