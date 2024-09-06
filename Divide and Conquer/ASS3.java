/*Q3. Given an array of positive and negative integers, segregate them in linear time and constant space. The 
output should print all negative numbers, followed by all positive numbers. The relative order of elements 
must remain the same.
arr[] = {19, -20, 7, -4, -13, 11, -5, 3}
arr[] = {-20 ,-4, -13, -5, 19 ,7 ,11, 3} */

import java.util.Arrays;

public class ASS3 {
    public static void main(String[] args) {
        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
        int n = arr.length;

        merge(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void merge(int[] arr, int l, int h) {
        if (l<h) {
            int m  = l +((h-l)/2);

            merge(arr, l, m);

            merge(arr, m+1, h);

            mergeProcedure(arr,l,m,h);
        }
    }

    private static void mergeProcedure(int[] arr, int l, int m, int h) {
        int[] temp = new int[arr.length+1];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0) {
                temp[k++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0) {
                temp[k++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}
