import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number which we have to find factorial");
        long x = sc.nextLong();
        long res = factorialNumber(x);
        System.out.println("Factorial of a number = " + x +"! is =" + res);
        sc.close();
        //Time complexity = 0(n);
        //Space complexity = 0(n);
    }

    public static long factorialNumber(long x) {
        long result = 0;
        if (x==0 || x==1) {
            return 1;
        }
        else {
         result = x * factorialNumber(x-1);
        }

         return result;
         
    }
}