import java.util.ArrayList;
 class Pair {
    int first ,second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

}
class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
     }
public class PairSum {
    
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode n = new TreeNode(val);
            return n;
        }
        if(root.val > val){
            root.left = insertIntoBST(root.left ,val);
        }
        else{
            root.right = insertIntoBST(root.right ,val);
        }
        return root;
    }
    
   public static void main(String[] args) {
        TreeNode root  = null;
        root = insertIntoBST(root , 15);
        root = insertIntoBST(root , 10);
        root = insertIntoBST(root , 20);
        root = insertIntoBST(root , 8);
        root = insertIntoBST(root , 6);
        root = insertIntoBST(root , 25);

        int sum = 24;

        Pair pair = findPair(root , sum);

        System.out.println(pair.first +" " + pair.second);

   }

static Pair findPair(TreeNode root, int sum) {
    ArrayList<Integer> res = new ArrayList<>();

    inOrder(root , res);

    //two pointer approach
    int n  = res.size();
    int i = 0;
    int j = n-1;

    while (i<j) {
        if (res.get(i)+ res.get(j) == sum) {
            return new Pair(res.get(i) , res.get(j));
        }
        else if (res.get(i)+ res.get(j) > sum) {
            j--;
        }
        else{
            i++;
        }
    }
    return new Pair(-1 , -1);
}

private static void inOrder(TreeNode root, ArrayList<Integer> res) {
    if (root == null) {
        return;
    }
    inOrder(root.left, res);
    res.add(root.val);
    inOrder(root.right, res);
} 
}
