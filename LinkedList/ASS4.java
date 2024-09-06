/* Q4. Given the head of a singly linked list, return true if it is a palindrome or false otherwise*/
import java.util.ArrayList;
import java.util.List;
public class ASS4 {
    ListNode head;

    class ListNode {
        int val;
        ListNode next;
         
        ListNode (int d){
         val= d;
         next = null;
        }
    }

    public void enter(int data){
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head =  new ListNode(data); //That will store the new node address in the new node
            return;
        }
        newNode.next = null;
        ListNode temp = head;

        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    public boolean isPalindrome(ListNode head) {
       ListNode temp = head;
       List<Integer> a = new ArrayList<>();
       while (temp!=null) {
            a.add(temp.val);
            temp = temp.next;
       }

       int low =0;
       int high = a.size()-1;
       while (low<high) {
            if (a.get(low) != a.get(high)) {
                return false;
            }
            low = low +1;
            high = high -1;
       }
       return true;

    }
    public static void main(String[] args) {
        ASS4 a = new ASS4();
        a.enter(1);
        a.enter(2);
        a.enter(3);
        a.enter(3);
        a.enter(2);
        a.enter(1);

        System.out.println(a.isPalindrome(a.head));

    }
}

