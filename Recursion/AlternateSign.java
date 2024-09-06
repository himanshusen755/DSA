import java.util.Scanner;
//Code of assingment 2
public class AlternateSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       //Function calling
       int result = alernate(n); 
       System.out.println(result);
       sc.close();
    }

    private static int alernate(int n) {
        //Base case conditon
        if (n == 0) {
            return 0;
        }
        //Recursive calls
        else if (n%2==0) {
            return alernate(n-1) - n;
        }
        else{
            return alernate(n-1) + n;
        }
    }
}
