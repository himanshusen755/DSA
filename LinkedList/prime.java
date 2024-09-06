import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int p = 0;
        int n ;
        Scanner sc =  new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 2; i <=n; i++) {
            if (n%i==0) {
                p++;
            }

        }
        if (p==1) {
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
        sc.close();
        
    }
}
