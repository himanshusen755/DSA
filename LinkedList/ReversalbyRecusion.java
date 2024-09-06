
public class ReversalbyRecusion {
    static Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void End(int data){
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
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    //implementatiomn of a linked list by recursion approach
    public static void reversal(Node curr , Node prev){
        //last node of linked list
        if (curr.next == null) {
            head = curr;
            curr.next = prev;
            return;
        }
        Node next = curr.next;
        curr.next = prev;
        //Recursive function call
        reversal(next, curr);
    }
    public static void main(String[] args) {
        ReversalbyRecusion list =  new ReversalbyRecusion();

        list.End(1);
        list.End(2);
        list.End(3);
        list.End(4);
        list.End(5);
        list.End(11);
        list.End(12);
        list.End(13);
        list.End(14);
        list.End(15);

        System.out.println("Normal flow");
        list.disp();
        reversal(list.head,null);
        System.out.println();
        list.disp();


    }
}
