import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the num:");
        int n = sc.nextInt();
        int result = sumDigit(n);
        System.out.println(result);
        sc.close();
    }

    private static int sumDigit(int n) {
        //Base case condition 
        //time complexity = 0(1)
        if (n == 0) {
            return 0;
            //Recurence relation T(n) = T(n/10) + c;
            //Time complexity = T(n) = 0(log10n);
        } else {
            return n%10 + sumDigit(n/10);
        }
    }
}
