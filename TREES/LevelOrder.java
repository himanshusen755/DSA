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

public class LevelOrder {
    public static void main(String[] args) {
        Node root = new Node(1 );
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left =new Node(4);
        root.left.right =new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
    }
}
