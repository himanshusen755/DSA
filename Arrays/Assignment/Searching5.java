package Arrays.Assignment;
/*Q5: Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer 
with itself */
import java.util.Scanner;

public class Searching5 {
    public static long findSqaureRoot(long num) {
        long low = 0 ,high = num/2 ;
        long result = -1;
         //Modified Binary Search
         while (low<=high) {
             long mid = low + (high - low)/2;
             long val = mid * mid;
             if (val==num) {
                 //perfect Square
                 return mid;
             }
             else if (val<num) {
                 low = mid + 1;
             }
             else{
              high = mid - 1;
             }
 
         }
         return result;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to which you need square root: ");
        int num  =  sc.nextInt();
        
        //Function calling 
       long result = findSqaureRoot(num);
       if (result==-1) {
        System.out.println("False");
       }
       else{
        System.out.println("True");
       }
       sc.close();
    }
}
