public class ReversalInLL {
    Node head;

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

    //Implementation of reversal of a node in linked list

    public void reversal(){
        Node curr = head;
        Node next = null;
        Node prev = null;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return;
    }
    public static void main(String[] args) {
        ReversalInLL list = new ReversalInLL();
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
        System.out.println();
        list.disp();
        System.out.println();
        list.reversal();
        list.disp();
    }
    //Time complexity = 0(n);
    //Space complexity = 0(1);
}
