import java.util.*;
public class LongestSSumSubequenceMemoization {
    public static void main(String[] args) {
        //LCS = GTABY (4)
        String s1 = "AGGTAYB";
        String s2 = "GXTXAYB";

        int m = s1.length();
        int n = s2.length();

        System.out.println("Longest common subsequence is : " + LCS(s1,s2,m,n));
    }
    //Function defination of LCS using the Memoization appoarch - (Enhanced Recursion) - Dyanmic Prog.
    //Time complexity : O(n*m)
    //Space complexity : O(n*m)
    
    private static int LCS(String s1, String s2, int m, int n) {
        int[][] dp = new int[m+1][n+1];

        for (int[] is : dp) {
            Arrays.fill(is , -1);
        }

        
        //Base case condition
        if (m==0 || n==0) {
            return 0;
        }
        
        //Optimization Logic - To avoid the re-computation of same function calls
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        //Recursive function calling 
        //exact match
         if (s1.charAt(m-1) == s2.charAt(n-1)) {
            return dp[m][n] =  1 + LCS(s1, s2, m-1, n-1);
        }
        //no exact match
        else{
            return dp[m][n] = Math.max(LCS(s1,s2,m-1,n), LCS(s1, s2, m, n-1));
        }
    }
}
