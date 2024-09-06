/*Q2. Given an array of positive and negative integers, segregate them in linear time and constant 
space. The output should print all negative numbers, followed by all positive numbers.
arr[] = {19, -20, 7, -4, -13, 11, -5, 3}
arr[] = {-20 ,-4, -13, -5, 19 ,11 ,3, 7} */

import java.util.Arrays;

public class ASS2 {
   public static void main(String[] args) {
    int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
    int n = arr.length;

    partition(arr,0,n-1);
   
    System.out.println(Arrays.toString(arr));

   }

   private static void partition(int[] arr, int l, int h) {
     int s = l;
     
      for (int i = s+1 ; i <= h; i++) {
         if (arr[i]<0) {
            int temp = arr[i];
            arr[i] = arr[s];
            arr[s] =temp;
            s++;
         }
     }
   } 
}
