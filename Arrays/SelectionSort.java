package Arrays;
import java.util.Arrays;
/*suppose we have a random array 
 * we store the minimum element index
 * min_idx = i
 */
import java.util.Scanner;

public class SelectionSort {
    public static void swap(int[] arr , int n , int i){
            int temp = arr[n];
            arr[n] = arr[i];
            arr[i] = temp;
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
        selectionSort(arr);
        System.out.println("Sorted Array is : \n" + Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_idx = i; //min_idx is taking the index of minimum element at every iteration
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min_idx]) {
                    min_idx = j; //This is help to change the index of element that is present in an 
                    //array it is the minimum element
                }
            }
            if (min_idx!=i) {
                //By this we can check the min_idx is not equal to i the we will swap it with ith location
                //so that the smallest element is reached at its correct postion after 1st pass
                swap(arr, min_idx , i) ;
            }
        }
     //Time complexity = 0(n^2)
     //SC is constant
    }
}
