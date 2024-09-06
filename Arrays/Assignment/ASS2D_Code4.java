package Arrays.Assignment;

import java.util.Scanner;

public class ASS2D_Code4 {
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
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    max = Math.max(max, arr[i][j]);
                }
            }
            System.out.println("Maximum element in the array is : " + max);
            sc.close();
    }
}
