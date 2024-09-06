/*Q1. Given an integer array, find the kth largest element using the quick select algorithm.
input 1 : arr[] = {1,3,2,4,5,6,7} , k = 3
output 1 : 5
input 2: arr[] = {4,3,3,2,1} , k = 4
output 2:  */

/**
 * ASS5
 */
public class ASS5 {

    public static void main(String[] args) {
        int [] arr = {46,25,76,33,456,956,446,1123};
        int n = arr.length;
        int k = 4;

        int result = selectProcedure(arr,0,n-1,k);
        System.out.println("Kth largest element is : " + result);
    }

    private static int selectProcedure(int[] arr, int l, int h, int k) {
        
            int m = partition(arr , l , h);

            if (m == k-1) {
                return  arr[m];
            }

            else if (m < k-1) {
                return selectProcedure(arr, m+1 , h, k);
            }

            else
                return selectProcedure(arr, l, m-1 , k);
            
        }
    

    private static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l;

        for (int j = l+1; j <= h; j++) {
            if (arr[j]>=pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
        int temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;

        return i;
    }
}