class Node{
    int val;
    Node left = null;;
    Node right = null;

    Node(int val){
        this.val = val;
    }

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
}
// TC - 0(n^2)
public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1 , new Node(2) , new Node(3));
        root.left.left =new Node(4);
        root.left.right =new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

        LOT(root);
    }

    private static void LOT(Node root) {
       int level = 1;
       while (printLevel(root , level) == true) {
            // printLevel(root , level);
            level++;
       }
    }

    private static boolean printLevel(Node root, int level) {
       
        if (root == null) {
            return false;
        }
        if (level == 1) {
            System.out.print(root.val + " ");
            return true;
        }
        boolean left = printLevel(root.left, level--);
        boolean right = printLevel(root.right, level--);

        return left || right ;
    }
}
