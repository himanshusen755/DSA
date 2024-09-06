import java.util.*;
public class MatrixChainMultilpicatioMemoization {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8};
        int n = arr.length;
        int i = 1;
        int j = n-1;
        System.out.println("Minimum number of operations : " + MCM(arr , i , j));
    }

    private static int MCM(int[] arr, int i, int j) {
        int[][] dp = new int[arr.length][arr.length];
        for (int[] ks : dp) {
            Arrays.fill(ks , -1);
        }
        if (i==j) {
           return 0; 
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int minOpr = Integer.MAX_VALUE;
        for (int k = i; k < j ; k++) {
            int opr = MCM(arr , i , k) + MCM(arr, k+1, j) + (arr[i-1]*arr[k]*arr[j]);
            minOpr = Math.min(minOpr, opr);
            dp[i][j] = minOpr;
        }
        return minOpr;
    }
}
