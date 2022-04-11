// Linked List
public class LinkedListFromScratch {
    Node head;
    
    public void add(int data) {
        // empty list
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            // list not empty
            Node nodeToAdd = new Node(data);
            nodeToAdd.next = this.head;
            this.head = nodeToAdd;
        }
    }
    
    public static void main(String[] args) {
        LinkedListFromScratch myList = new LinkedListFromScratch();
        myList.add(10);
        myList.add(18);
        System.out.println(myList.head.data);
        System.out.println(myList.head.next.data);
    }
}

// Node
class Node {
    int data;
    Node next;
    
    Node(int d) { this.data = d; }
}