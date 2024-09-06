// Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum 
// of every digit in that number raised to the power of total digits in that number is equal to the number.

// Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)

import java.util.Scanner;

public class Ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which need to verify it is armstrong or not");
        int a = sc.nextInt();
        int order  = FindOrder(a);
        int result = armstrong(a,order);
        if (result == a) {
            System.out.println("Armstrong number :");
        }
        else{
            System.out.println("Not a armstrong number ");
        }
        sc.close();
    }

    private static int FindOrder(int a) {
        int sum  = 0;
        while (a!=0) {
            sum++;
            a=a/10;

        }
        return sum;
    }

    private static int armstrong(int a, int order) {
        int result ;
        int b;
        if (a==0) {
            return 0;
        }
        else{
            b = a%10;
            result = (int)Math.pow(b, order) + armstrong(a/10, order);
        }
        return result;
    }
}
