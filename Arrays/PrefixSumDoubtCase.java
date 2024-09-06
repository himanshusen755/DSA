package Arrays;

import java.util.Scanner;

public class PrefixSumDoubtCase {
    static int[][] sum;
    public static void NumMatrix(int[][] matrix){
        int m = matrix.length , n = matrix[0].length;
        sum = new int[m+1][n+1]; // Sum[i][j] is sum of all element inside the rectangle[0,0,i,j]
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=n; j++) {
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + matrix[i-1][j-1];
            }
        }
    }
    // public static void NumMatrix(int[][] arr){
    //     int m = arr.length;
    //     int n = arr[0].length;
    //     sum = new int[m+1][n+1];
    //     //Traverse the array row wise to calculate row wise prefix sum
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 1; j < n; j++) {
    //             arr[i][j]+=arr[i][j-1]; //Start j= 1 because we cant want to change the value at a[0][0]
    //         }
    //     }
    //     //Traverse the array column wise to calculate the column wise prefix sum of the same array
    //     for (int j = 0; j < n; j++) {
    //         for (int i = 1; i < m; i++) {
    //             arr[i][j] += arr[i-1][j];
    //         }
    //     }
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             sum[i+1][j+1] = arr[i][j];
    //         } this is my way of understand
    //     }
    public static int sumRegion(int r1 , int c1 , int r2 , int c2) {
        r1++ ; c1++ ; r2++; c2++;
       return sum[r2][c2] - sum[r2][c1 -1] -sum[r1-1][c2] + sum[r1-1][c1-1]; 
    }
    public static void main(String[] args) {
        int m ,n ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        m = s.nextInt();
        System.out.println("Enter the number of column");
        n = s.nextInt();
        System.out.println("enter the element in the array ");
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();

            }
        }
        int r1, r2,c1 ,c2;
        System.out.println("Enter the r1");
        r1 = s.nextInt();
        System.out.println("Enter the c1");
        c1 = s.nextInt();
        System.out.println("Enter the r2");
        r2 = s.nextInt();
        System.out.println("Enter the c2");
        c2 = s.nextInt();
        NumMatrix(arr);
        System.out.println(sumRegion(r1, c1, r2, c2));
    }
}
