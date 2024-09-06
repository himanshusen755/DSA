package Arrays;

import java.util.Scanner;
//Time complexity = 0(log n)
//Space complexity = 0(1)
public class SquareRoot {
    public static long findSqaureRoot(long num) {
       long low = 0 ,high = num/2 , result = -1;
        //Modified Binary Search
        while (low<=high) {
            long mid = low + (high - low)/2;
            long val = mid * mid;
            if (val==num) {
                //perfect Square
                return mid;
            }
            else if (val<num) {
                //Store the floor value , in case if not available the perfect square so we can 
                //give the floor value
                result = mid;
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
        System.out.println("Sqaure root of the given Number is : " + result);
        

    }
}
