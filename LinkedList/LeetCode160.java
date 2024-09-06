
 
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 public class LeetCode160 {
    public int lengthL(ListNode head){
        int count = 0;
        ListNode temp = head;
        while (temp!=null) {
            count++;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lA = lengthL(headA);
        int lB = lengthL(headB);

        ListNode cA = null;
        ListNode cB = null;
        int diff;

        if (lA>lB) {
            cA = headA;
            cB = headB;
            diff = lA - lB;
        }
        else{
            cA=headB;
            cB = headA;
            diff = lB - lA;
        }
        while (diff!=0) {
            cA = cA.next;
            diff--;
        }

        while (cA!=null && cB!=null) {
            if (cA == cB) {
                return cA;
            }
            cA = cA.next;
            cB = cB.next;
        }
        return null;
    }
}