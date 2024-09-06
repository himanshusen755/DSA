import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which sum is needed");
        System.out.println("Sourabh rajak");
        int x = sc.nextInt();
        int result = fibonacci(x);
        System.out.println("Result of sum of number at the number " + result);
        sc.close();
        //Time complexity = 0(2^n); Exponential time complexity
        //Space complexity =0(n)
        }

    private static int fibonacci(int x) {
        //Base case condition
        if (x <=1) {
            return x;
        }
        //Recursive calls
        else{
            return fibonacci(x-1) + fibonacci(x-2);
         }
    }
}
