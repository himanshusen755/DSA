package Arrays;
import java.util.*;
// import java.io.*;
 
  public class Rotaion {
      public static void rotatedMatrix(int[][] arr){
        //Transpose 
        int m = arr.length; //No of rows
        int n = arr[0].length; //No of column
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //Step 2 swap 
        for (int i = 0; i < m; i++) {
            int li = 0;
            int ri = n-1;
            while (li<ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }
    }
    //TRANSPOSE OF Matrix is not same as rotaion but just like a transpose in which matrix is rotated 
    //by 90 degree
    /*Steps to achieve the Rotation 
     * 1 = Transpose of matrix (interchange rows and column)
     * 2 = Swap among the columns ROWS<-> COLUMN
     */

     public static void main(String[] args) {
        int [][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int m = arr.length;
        int n = arr[0].length;
        //Function Calling
        rotatedMatrix(arr); 

    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             System.out.print(arr[i][j]+ "  ");
    //         }
    //         System.out.println("");
    //     }
    for (var mat : arr) {
        System.out.println(Arrays.toString(mat));
    }
     }
}
//time complexities : O(m*n)
//Space complexities : O(1)
