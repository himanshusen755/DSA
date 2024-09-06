/*Q3.Detect if an Array contains a duplicate element. At Most 1 duplicate would be there.
Input: 1,2,3,4 
Output No 
Input: 1, 2, 3, 4, 1 
Output: Yes */

package Assignment;
import java.util.*;
public class Ass3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the element of an array ");
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Store the element that will be stored in the hashMap and cehck for the duplicate");
        boolean result = checkDuplicate(arr);
        System.out.println("HashMap can contain duplicate : " + result);
        sc.close();
    }

    private static boolean checkDuplicate(int[] arr) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                return true;
            }
            else{
                hm.put(arr[i], i);
            }
        }
        return false;
    }
}
