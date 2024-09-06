package Arrays.Assignment;
// Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
import java.util.Scanner;

public class seaching3 {
    public static int FindingLowerBound(int[] a , int x){
        int low = 0;
        
        int high = a.length-1;
        int result = a.length;
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
       System.out.println("Enter the BINARY ARRAY  : ");
       int arr[] = new int[n];
       for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
       } 
       int target = 1;
       int result = FindingLowerBound(arr, target);
       System.out.println("Total times 1's present in the array is = " + (arr.length - result));
       sc.close();
    }
}
