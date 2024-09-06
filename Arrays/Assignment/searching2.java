package Arrays.Assignment;
/*Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is 
not present return -1.

Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
Output 1: 6
Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
Output 2: -1 */
import java.util.Scanner;

public class searching2 {
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

       int result = LastOccurence(arr , target);
       System.out.println("Last occurence of an element is : " + result);
       sc.close();
    }

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
    
}
