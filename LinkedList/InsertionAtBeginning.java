public class InsertionAtBeginning {
    Node head;

    class Node{
        int data;
        Node next ;

        Node(int d){
            data = d;
            next = null;
        }
    }

    //Insertion of a node at the beginning 

    public void insertAtStart(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void disp(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        InsertionAtBeginning list = new InsertionAtBeginning();
        list.insertAtStart(5);
        list.insertAtStart(10);
        list.insertAtStart(15);
        list.insertAtStart(20);

        list.disp();

        list.insertAtStart(11);
        System.out.println();
        list.disp();
    }
}