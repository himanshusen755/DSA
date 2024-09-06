import java.util.Scanner;
// Q1 : Given an integer, find out the sum of its digits using recursion.
public class Ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upto you want the sum");
        int n =sc.nextInt();

        int res = sumOfNumber(n);
        System.out.println("Sum upto the number is : " + res);
        sc.close();
    }

    private static int sumOfNumber(int n) {
       int result =0;
       if (n==0) {
          return 0;
       }
       else{
        result = n%10 + sumOfNumber(n/10);
       }
       return result;
    }
}
