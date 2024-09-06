/*It is used to detect the cycle ior loopr present inside a linked list also knowns as 
1 = Floyd's cycle detection algorithm
2 = Two pointer algorithm
3 = Hare- tortoise Algorithm
 */
public class FlyodsCycle {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
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
    //Implementatiopn of a loop in a linked list 
    public void detetctLoop(){
        Node slow = head;
        Node fast = head;
        int flag=0;

        while (slow!=null && fast!=null && fast.next!=null) {
            slow= slow.next;
            fast = fast.next.next;
            if (slow==fast) {
                flag = 1;
                break;
            }
        }
        if (flag==1) {
            System.out.println("Loop is detected:");
       }
       else{
        System.out.println("Loop is not detected ");
       }
    }
    public static void main(String[] args) {
        FlyodsCycle list = new FlyodsCycle();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(25);
        list.insertAtEnd(20);


        // Implementation of circular linked list
        Node temp = list.head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = list.head;
         list.detetctLoop();
         System.out.println();
    }
}
