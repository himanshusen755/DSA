package Arrays.Assignment;

import java.util.Scanner;

public class ASS2D_Code2 {

     public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number of rows :");
        int m = sc.nextInt();
        System.out.println("Enter the Number of Column :");
        int n = sc.nextInt();
        int[][] arr =  new int[m][n];
            for ( int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Diagonal elemnts is :");
            for ( int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(i+j<m-1){
                        System.out.println(arr[i][j]);
                    }
                }
            }
            sc.close();
     }
}
