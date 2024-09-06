/*You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.*/

import java.util.Scanner;
//Time complexity = O(log m*n)
public class LeetCodeBinarySearch74 {
    public static void main(String[] args) {
        int [][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        boolean result = searchMatrix(arr,target);
        System.out.println(result);
        sc.close();
    }
    private static boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int low = 0 , high = m*n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if (arr[mid/n][mid%n]==target) {
                return true;
            }
            else if (arr[mid/n][mid%n] >target) {
                high = mid -1 ;
            }
            else
            {
                low = mid +1;
            }

        }
        return false;
    }
}
