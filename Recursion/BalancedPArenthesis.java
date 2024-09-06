//Leetcode 20
import java.util.Scanner;

public class BalancedPArenthesis {
    public static void printBr(int n , int oc , int cc , String ans) {
       if (oc == n && cc == n) {
            System.out.println(ans);
            return;
       }
       
        if (oc<n) {
            printBr(n, oc+1, cc, ans + '(');
        }
        if (oc>cc) {
            printBr(n, oc, cc+1, ans + ')');
        }
    
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oc = 0; //Open Count
        int cc = 0 ; //Close count
        String ans = "";
        printBr(n, oc, cc, ans);
        sc.close();
    }
}
