public class DeletionInLL {
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
    //InsertionAtBeginnig
    public void IAB(int data){
        Node newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;
    }
    //InsertionAtIndex
    public void Index(Node prev_node , int data){
        Node newNode = new Node(data);
        if (prev_node==null) {
            System.out.println("Linked list is empty");
        }
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }
    //Implementation of displaying LL
    public void disp(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    //Implementation of a deletion of a node in Linked list
    public void deletion(int pos){
        //If linked list is emptyt
        if (head == null) {
            System.out.println("Nothing is deleted because of empty list");
            return;
        }
        Node temp = head;
        //Check for the first node;
        if(pos == 0) {
            head=temp.next; 
        }
        else{
            for (int i = 0; i < pos-1 && temp!=null ;i++) {
                temp = temp.next;
            }
            //Condition for checking the trmp node is last node or not
            if (temp==null && temp.next == null) {
                return;
            }
            else{
                temp.next=temp.next.next;
            }
        }
    }
    public static void main(String[] args) {
        DeletionInLL list = new DeletionInLL();
        list.insertAtEnd(2);
        list.insertAtEnd(5);
        list.insertAtEnd(12);
        list.insertAtEnd(20);


        System.out.println("Before inertion  of 12");
        list.disp();
        System.out.println();

        list.insertAtEnd(11);
        System.out.println("After the insertion");
        list.disp();
        list.deletion(3);
        System.out.println("After the Deletion");
        list.disp();
}
}