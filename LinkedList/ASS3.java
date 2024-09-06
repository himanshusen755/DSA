public class ASS3 {
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
    public void delete(){
       if (head == null && head.next == null) {
        return;
       }
       Node curr = head;
       while (curr!=null && curr.next!=null) {
        if (curr.data == curr.next.data) {
            curr.next = curr.next.next;
        }
        else{
            curr = curr.next;
        }
       }
       
    }
    
   
    public static void main(String[] args) {
        ASS3 list = new ASS3();
        list.enter(2);
        list.enter(2);
        list.enter(3);
        list.enter(7);
        list.enter(13);
        list.enter(13);
        list.enter(15);
        list.enter(15);


        System.out.println("Linked list is : ");
        list.disp();
        System.out.println();
        list.delete();
        list.disp();
    }
}
