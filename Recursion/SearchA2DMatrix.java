
/*You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.*/

import java.util.Scanner;
//Recursion code for binay search in 2D array
public class SearchA2DMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        int m = arr.length; //No of rows 
        int n = arr[0].length;//No of column 
        int low =0; 
        int high = m * n - 1;
        //Function calling
        boolean result = searchMatrix(arr,target,low,high);
        System.out.println("Result is :" + result);
        sc.close();
    }
    private static boolean searchMatrix(int[][] arr, int target , int low , int high) {
        int n = arr[0].length;
        while(low <= high){
            int mid = low + (high-low)/2; //finding mid value 
            //Base case
            if (arr[mid/n][mid%n]==target) {
                return true;
            }
            //Recursive calls
            else if (arr[mid/n][mid%n] > target) {
                return searchMatrix(arr, target, low, mid-1);
            }
            else
            {
              return  searchMatrix(arr, target, mid +1, high);
            }

        }
        return false;
    }
}
    