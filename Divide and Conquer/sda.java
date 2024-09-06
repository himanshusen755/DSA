import java.util.Scanner;
import java.util.Stack;

public class sda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int a = Math.max(n, m);
        int b = Math.min(n, m);

        for (int i = b; i <= a; i++) {
            System.out.print(i + " ");
        }
    }
}