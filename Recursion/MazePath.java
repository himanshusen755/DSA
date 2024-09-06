import java.util.Scanner;

public class MazePath {
    public static void mazePath(int cr ,int cc , int dr , int dc , String ans){
        //cc - Current column
        //cr - Current Row
        //dr - Destination Row
        //dc - Destination column
        if (cc>dr || cr>dr) { //negative base case 
            return ;
        }
        if (cc == dc && cr == dr) {
            System.out.println(ans);
            System.out.println("-----------------------------------------------------------");
            return;
        }
        mazePath(cr, cc+1, dr, dc, ans+"H ");
        mazePath(cr+1, cc, dr, dc, ans+"V ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the destination row : ");
        int dr = sc.nextInt();
        System.out.println("ENter the destination column");
        int dc = sc.nextInt();
        mazePath(0 , 0 , dr , dc , "" );
        sc.close();
    }
}
