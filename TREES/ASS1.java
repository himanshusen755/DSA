/*Q1. Given the root of a binary tree, return the spiral level order traversal of its nodes' values. The 
solution should consider the binary tree nodes level by level in spiral order, i.e., all nodes present 
at level 1 should be processed first from left to right, followed by nodes of level 2 from right to left, 
followed by nodes of level 3 from left to right and so on… In other words, odd levels should be 
processed from left to right, and even levels should be processed from right to left. */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left = null , right = null;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class ASS1 {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.left = new Node(5);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        printSpiral(root);
    }

    private static void printSpiral(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            System.out.println(ans);
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while (!q.isEmpty()) {
            int size = q.size();
            // ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0 ; i<size ; i++){
                Node n = q.poll();
                int index = flag ? i : size - i -1;
                ans.add( index , n.data);
                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
            }
            flag = !flag;
        }
        System.out.println(ans);
    }
}
