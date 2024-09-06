/*Q2. Insert a node at the given position in a linked list. We are given a pointer to a node, and the 
new node is inserted after the given node */

public class ASS2 {
    Node head;

    class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }

    }
    
    public void enter(int data){
        Node nn = new Node(data);

        if (head == null) {
            head =  new Node(data);
            return;
        }
        nn.next = null;
        Node temp = head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        
        temp.next = nn;
        return;
    }
    public void disp(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }
    public void insertAtPosition(int data , int position){
        Node newNode = new Node(data);
        Node ptr = head;
        int i = 0;
        while (i!=position-1) {
            ptr = ptr.next;
            i++;
        }
        newNode.next =  ptr.next;
        ptr.next = newNode;
        
    }
    public static void main(String[] args) {
        ASS2 list = new ASS2();
        list.enter(2);
        list.enter(3);
        list.enter(14);
        list.enter(8);
        list.enter(15);
        list.enter(12);

        System.out.println("Linked list is : ");
        list.disp();
        System.out.println();
        list.insertAtPosition(33, 2);
        list.disp();
    }
}
