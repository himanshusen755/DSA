package Arrays;

import java.util.Scanner;

public class prefixSumBestApproach {
    //Time complexity = '0(m*n)'5
    
    public static void prefixSumMatrix(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        //Traverse the array row wise to calculate row wise prefix sum
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j]+=arr[i][j-1]; //Start j= 1 because we cant want to change the value at a[0][0]
            }
        }
        //Traverse the array column wise to calculate the column wise prefix sum of the same array
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                arr[i][j] += arr[i-1][j];
            }
        }
        //HEre we have complete the final 2D matrix 

    }
    //Time complexity of this particular function is O(1) because no loops inside it .
    //SC is also constant
    public static int sumRegion(int[][] arr , int r1 ,int c1 , int r2 , int c2) {
        int sum = 0, up = 0,repeated = 0,left = 0;
        sum =arr[r2][c2];
        up = arr[r1-1][c2];
        left = arr[r2][c1-1];
        repeated = arr[r1-1][c1-1];

        int result = sum - up - left +repeated;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = sc.nextInt();

        System.out.println("Enter number of  column ");
        int n =  sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Enter the element of the matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int r1,r2,c1,c2;
        System.out.println("Enter the value of r1:");
        r1 = sc.nextInt();
        System.out.println("Enter the value of c1:");
        c1=  sc.nextInt();
        System.out.println("Enter the value of r2:");
        r2 = sc.nextInt();
        System.out.println("Enter the value of c2:");
        c2 = sc.nextInt();
        
        prefixSumMatrix(arr);
        int result = sumRegion(arr,r1,c1,r2,c2);
        System.out.println("RESULT = " + result);
        sc.close();
    }

    
}
