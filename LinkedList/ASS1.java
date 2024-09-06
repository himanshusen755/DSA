/*Q1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
Examples:
14->21->11->30->10, X = 14
Yes
Explanation: 14 is present in the linked list */

import java.util.Scanner;

public class ASS1 {
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
    public int count(){
        Node temp = head; int count1 =0;
        while (temp!=null) {
            count1++;
            temp = temp.next;
        }
        return count1;
    }
    public static void main(String[] args) {
        ASS1 list = new ASS1();
        list.enter(2);
        list.enter(3);
        list.enter(14);
        list.enter(8);
        list.enter(15);
        list.enter(12);

        System.out.println("Linked list is : ");
        list.disp();
        System.out.println();
        int high = list.count();
        System.out.println("Enter the target value");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        
        boolean result = list.search(list.head , target);
        if (result == true) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public boolean search(Node head , int target) {
        Node temp = head;
        while (temp!=null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
