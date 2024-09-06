package Arrays;
/*It is just like a deck of card we played in hand 
 * first element is consider as sorted and further checking with another element 
 */
//Time complexity = 0(n^2)
//Space complexity = O(1)

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void swap(int[] arr , int n){
            int temp = arr[n];
            arr[n] = arr[n-1];
            arr[n-1] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        System.out.println("Enter the element inside the array:");
        int[] arr = new int[n];
        for(int i =0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Implementation of the insertion sort function
    private static void InsertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j =i;
            while (j>0 && arr[j]<arr[j-1]) {
                //swap the element between arr[j] and arr[j-1]
                swap(arr , j);
                j--;
            }
        }
    }
}
