package Arrays;
import java.util.Scanner;

/*Prefix sum concept in 2D Array
problem statement given two coordinate and make the rectangle and find the sum of all elmenet
 that is enclosed inside the rectangle
 * 
 */
public class PrefixSum_Brute {
    public static int findSumMatrix(int[][] arr , int r1 , int r2 ,int c1, int c2) {
          int sum = 0 ;
           for(int i = r1 ; i<=r2 ;  i++){
            for (int j = c1; j <=c2; j++) {
                sum+=arr[i][j];
            }
           }
        return sum;
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

        int result = findSumMatrix(arr, r1, r2, c1, c2);
        System.out.println("Sum of given coordinate :" + result);
        sc.close();
//Time complexity = O(m*n)
//Space complexity = O(1)
    }
    //But here is a problem that is not sutable for large number of query 
    //Objective is that our program is independent of number of query so we have to reduce this dependency 

}
