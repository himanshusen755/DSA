import java.util.Arrays;

/**
 * KnapsackRecursion
 */
 class KnapsackMemoization {

    public static void main(String[] args) {
        int[] profit = {60,100,120};
        int[] weight = {10,20,30};

        int m = 50;
        int n =  profit.length;

        System.out.println("Maximum profit is : "  + helper(m,profit,weight,n));
    }
    //Function defination of helper function of memoization appoarch
    public static int helper(int m , int[] profit , int[] weight , int n){
        //intialization of 2D array named "Dp"
        int[][] dp = new int[n+1][m+1];

        //Fill the 2D array with the value -1
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        //Function Calling
        return knapsack(m, profit, weight, n ,dp);
    }

    //Function defination of memoization appoarch in Dp
    //memoization approach -Enchanced Recursion
    private static int knapsack(int m, int[] profit, int[] weight, int n, int[][] dp) {
                //Base Case condition 
                if (n==0 || m==0) {
                    return 0 ;
                }
                //Optimization - Avoid the recomputation of recursive calls 
                if (dp[n][m]!= -1) {
                    return dp[n][m];
                }
                //Recursive Calls
                if (weight[n-1]>m) {
                    //Exclude the object
                    return dp[n][m] = knapsack(m, profit, weight, n-1 ,dp);
                }
                else{
                    //Max(exclude the object , include the object with profitt)
                    return dp[n][m]=Math.max(knapsack(m, profit, weight, n-1,dp), profit[n-1]+knapsack(m-weight[n-1], profit, weight, n-1,dp));
                }
    }
    
}
