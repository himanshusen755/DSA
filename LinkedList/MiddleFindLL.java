public class MiddleFindLL {
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
    //Implementaion for finding the middle node in the code 
    public void middle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
    public void rr(Node slow ,Node fast){
        if (fast==null || fast.next==null) {
            System.out.println(slow.data);
            return;
        }
        rr(slow.next , fast.next.next);
    }
    public static void main(String[] args) {
        MiddleFindLL list = new MiddleFindLL();
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
        // System.out.println();
        // list.disp();
        list.rr(list.head, list.head);;
        //Time complexity  = 0(n);

    }
}
