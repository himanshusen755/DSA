class Node{
    int data;
    Node left = null , right = null;

    public Node(int data){
        this.data = data;
    }
}

public class InorderPredecessor {
    public static Node insert(Node root , int key){
        if (root == null) {
            return new Node(key);
        }
        if (root.data > key) {
            root.left = insert(root.left, key);
        }
        else{
            root.right = insert(root.right, key);
        }
        return root;
    }
    public static void main(String[] args) {
        int [] keys = {15,10,20,8,12,16,25};
        Node root = null;
        for (int i : keys) {
            root = insert(root , i);
        }
        for (int key : keys) {
            Node prec = findPred(root ,  null , key);
        }
    }
    private static Node findPred(Node root, Node prec, int val) {
        if (root == null) {
            return prec;
        }

        if (root.data == val) {
            if (root.left!=null) {
                return findMax(root.left);
            }
        }
        else if (val < root.data) {
            return findPred(root.left, prec, val);
        }
        else{
            prec = root;
            return findPred(root.right, prec, val);
        }
        return prec;
       
    }
    private static Node findMax(Node root) {
        while (root.right!=null) {
            root = root.right;
        }

        return root;
    }
}
