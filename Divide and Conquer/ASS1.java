/*Q1. Given an array where all its elements are sorted in increasing order except two swapped 
elements, sort it in linear time. Assume there are no duplicates in the array.

 arr[] = [3, 8, 6, 7, 5, 9, 10]  

 arr[] = [3, 5, 6, 7, 8, 9, 10] */

import java.util.Arrays;

public class ASS1 {
    public static void main(String[] args) {
        int [] arr = {3, 8, 6, 7, 5, 9, 10};
        int n = arr.length;

        sortARR(arr, n);

        System.out.println(Arrays.toString(arr));
        
    }

    private static void sortARR(int[] arr, int n) {
       int x = -1;
       int y = -1;

       for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]>arr[i]) {
                if (x==-1) {
                    x = i-1;
                    y = i;
                }
                else{
                    y =i;
                }
            }
            
       }
       int temp = arr[x];
       arr[x] = arr[y];
       arr[y] = temp;
    }
}
