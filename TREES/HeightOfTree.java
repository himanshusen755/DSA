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
public class HeightOfTree {

    public static void main(String[] args) {
        Node root = new Node(1 , new Node(2) , new Node(3));
        root.left.left =new Node(4);
        root.left.right =new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

        System.out.println(height(root));


    }

    private static int height(Node root) {
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(height(root.left), height(root.right));
    }
}