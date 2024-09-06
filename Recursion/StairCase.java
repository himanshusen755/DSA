import java.util.Scanner;

public class StairCase {
   public static void main(String[] args) {
    //Available moves in staircase problem is only we can 1 step or 2 step at a time
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of stairs");
    int a = sc.nextInt();
    
    //Function calling
    int result = count(a+1); //because it is not a fibonacci series 
    //This show the relationship between this prob and fibonacci problem 
    System.out.println("No of ways to do this is : " +result);
    sc.close();
   }

private static int count(int a) {
    int result;
    //Time complexity = 0(2^n)
    //space complexity =0(n) //Due to the stack contain  the function calls
   if (a<=1) {
     return a;

   }
   else{
      result = count(a-1) + count(a-2);
   }
   return result;
} 
}
