package Arrays;

import java.util.Scanner;
/*Binary search 
 * Only applicable on sorted array
 * using mid (low + high )/2 instead of using this  we can use 
 * mid = low + (high-low )/2 because when we have high gap between low and high the it is suiable 
 * for not giving out of bound Exception
 */
public class BinarySearch {
    //Time complexity of this algo is = 0(log n base 2)
    //Space complexity = constant
    public static int BinarySearch(int[] arr , int x){
        int low = 0;
        int high = arr.length-1;
        int index = -1;
        
        while (low<=high) {
            int mid = low + (high - low)/2;
            if (arr[mid]==x) {
                index = mid;
                break;
            }
            else if (arr[mid]>x) {
                high = mid -1;
            }
            else if (arr[mid]<x) {
                low = mid + 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n  =  sc.nextInt();
        System.out.println("Enter the element of an array :");
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] =sc.nextInt();
        }
        System.out.println("Enter the target Element of an array");
        int target = sc.nextInt();

        int result = BinarySearch(a , target);

        if (result==-1) {
            System.out.println("Element is not found ");
        }
        else{
            System.out.println("Element is found at index :" + result);
        }
sc.close();
}
}