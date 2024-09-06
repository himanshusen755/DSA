
public class InsertionAtEnd {
    Node head;
    
    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    //Implemention of a insertion of a node LL
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);

        //Linked List is empty

        if (head == null) {
            head = new Node(newData);
        }
        //Linked list is not empty
        newNode.next = null;
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    //Implementation of displaying LL
    public void disp(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        InsertionAtEnd list = new InsertionAtEnd();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        list.insertAtEnd(10);

        System.out.println("Before inertion  of 12");
        list.disp();
        System.out.println();

        list.insertAtEnd(11);
        System.out.println("After the insertion");
        list.disp();

    }
    
}