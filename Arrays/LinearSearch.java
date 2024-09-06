package Arrays;
/*searching in array
 * to find the value present in the array at a particular location
 * wo types of searching in DS 1. Linear Search 2.Binary Search
 * If the element present inside the array then rey=turn the index value otherwise -1 that
 * define that the element is not inside the array
 */
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Size of array
        System.out.println("Enter the no of element in  the array");
        int n  = sc.nextInt();
        //Element of an array 
        System.out.println("Enter the Array Element :");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element ");
        int target = sc.nextInt();
        int index = -1;       
         for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
               index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element is not present inside an array :");
        }
        else {
            System.out.println("Element is present inside an  array at a index of  =" + index);
        }
    }
    //Time Complexity = 0(n)
    //Space complexity = 0(1)
    /*Adavanatges 
     * 1. simple to understand
     * 2. suitable for all type of array
     * 3. No addtional space required 
     * 
     * Disadvanatges 
     * 1. when n is huge then the time required to execute the code is very large 
     */
}
