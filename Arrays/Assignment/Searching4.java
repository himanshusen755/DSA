package Arrays.Assignment;
/*Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element 
is not found in the array, report that as well.

Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
target = 5
Output: Target 5 occurs 3 times
Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
target = 6
Output: Target 6 occurs 2 times */
import java.util.Scanner;

public class Searching4 {
    private static int LastOccurence(int[] arr, int target) {
        int result = -1;
        int low = 0 , high = arr.length;

        while (low<=high) {
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                result = mid;
                low = mid + 1 ;
            }
            else if (arr[mid]>target) {
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return result;
    }
    public static int FindingLowerBound(int[] a , int x){
        int low = 0;
        int high = a.length-1;
        int result = 0;
        while(low<=high){
             
            int mid = low +(high-low)/2;
            if (a[mid]==x) {
                result = mid;
                high = mid -1;
            }
            else if(a[mid]>x) {
                high = mid - 1;
            }
            else if (a[mid]< x) {
                low = mid +1;
            }
        }
        return result;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of array : ");
       int n = sc.nextInt();
       System.out.println("Enter the element of the array : ");
       int arr[] = new int[n];
       for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
       }
       System.out.println("Enter the element which have to find :");
       int target = sc.nextInt(); 
       int first = FindingLowerBound(arr , target);
       int last = LastOccurence(arr,  target);
       int total = last - first + 1;
       System.out.println("Total no of occurenece of target " + target + " Element is :" + total);
       sc.close();
    }
}
