/*Q2. Given the root of a binary tree, check if it is a complete binary tree or not. A complete binary 
tree is a binary tree in which every level, except possibly the last, is filled, and all nodes are as far 
left as possible. */

import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int key) {
        this.key = key;
    }
}

public class Ass2 {
    public static void main(String[] args) {
        /* Construct the following tree
                  1
               /     \
              2       3
             / \     / \
            4   5   6   7
        */
 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
 
        if (isComplete(root)) {
            System.out.println("Complete binary tree");
        }
        else {
            System.out.println("Not a complete binary tree");
        }
    }

    private static boolean isComplete(Node root) {
        Queue<Node> q  = new LinkedList<>();
        q.add(root);
        boolean past = false;
        while (!q.isEmpty()) {
            Node n = q.poll();
            if (n == null) {
                past = true;
            }
            else{
                if(past == true)
                {
                    return false;
                }
                else {
                     q.add(n.left);
                     q.add(n.right);
                }
            }
        }
        return true;
    }
}
