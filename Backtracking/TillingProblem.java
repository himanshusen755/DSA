import java.util.Scanner;

public class TillingProblem {
    public static int GetWays(int n){
        //Base case 
        if(n<=3) return n;
        //recursive calls
        else {
            return GetWays(n-1)+(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = GetWays(n);
        System.out.println(res);
        sc.close();
    }
}
