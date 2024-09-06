/**
 * FibonacciSeries
 */
import java.util.*;
public class FibonacciSeries {
    public static Map<Long , Long> memo = new HashMap<>();
    public static void main(String[] args) {
        long n = 100;
        System.out.println("The fibonacci Series Value is : " + fibMemo(n));
    }

    //Function Calling - Memoization Dyanmic programming Apporach (Enhanced Recursion)
//Time complexity = - 0(n)
//Space Complexity - stack space + HashTable = O(n)
    public static long fibMemo(long n){
        if (n<=1) {
            return n;
        }
        //Optimized logic that help to avoid the recomputations in the recursive function call
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        //Recursive function call
        long fibVal  = fibMemo(n-1) + fibMemo(n-2);
        memo.put(n , fibVal);

        return fibVal;
    }








    // public static int fib(int n) {
    //     //Function Calling of Recursive Appoarch
    //     //TC = O(2^n)
    //     // Auxilary Space - O(n) 
    //     if (n <= 1) {
    //         return n;
    //     }
    //     else{
    //         return fib(n-1) + fib(n-2);
    //     }
    // }
}