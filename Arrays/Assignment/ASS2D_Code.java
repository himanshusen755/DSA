package Arrays.Assignment;

import java.util.Scanner;

public class ASS2D_Code {
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
        int even = 0 , odd=0 , zero =0 , positive = 0 , negative=0 ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                if (arr[i][j]%2==0) {
                    even++;
                }
                if (arr[i][j]%2!=0) {
                    odd++;
                }
                if (arr[i][j]>0) {
                   positive++;
                }
                if (arr[i][j]<0) {
                    negative++;
                }
                if (arr[i][j]==0) {
                    zero++;
                }
            }
        }
        System.out.println("Even is :" + even + "\nOdd is :" + odd + "\npostive is :" + positive +
        "\nNegative is :" + negative + "\nZero is :" + zero);
        sc.close();
   } 
}
