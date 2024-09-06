package Arrays.Assignment;

import java.util.Scanner;

public class ASS2D_CODE5 {
    public static void disp(int[][] arr , int m , int n){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                   if(i == (m)/2 || j == (n)/2) {
                    System.out.println(arr[i][j]);
                   }
                }
            }
    }
    public static void main(String[] args) {
        
    Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number of rows :");
        int m = sc.nextInt();
        System.out.println("Enter the Number of Column :");
        int n = sc.nextInt();
        int[][] arr =  new int[m][n];
        System.out.println("Enter the elements of the matrix");
            for ( int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            disp(arr, m, n);
        sc.close();
    }
}