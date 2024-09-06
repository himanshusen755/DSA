public class LongestSumSubSequenceRecursion {
    public static void main(String[] args) {
        //LCS = GTABY (4)
        String s1 = "AGGTAYB";
        String s2 = "GXTXAYB";

        int m = s1.length();
        int n = s2.length();

        System.out.println("Longest common subsequence is : " + LCM(s1,s2,m,n));
    }
    //Function defination of LCS using the recursive appoarch
    //Time complexity : O(2^n*m)
    //Space complexity : O(n)
    //Reason of overlappinng subproblem 
    private static int LCM(String s1, String s2, int m, int n) {
        //Base case condition
        if (m==0 || n==0) {
            return 0;
        }    
        //Recursive function calling 
        //exact match
         if (s1.charAt(m-1) == s2.charAt(n-1)) {
            return 1+LCM(s1, s2, m-1, n-1);
        }
        //no exact match
        else{
            return Math.max(LCM(s1,s2,m-1,n), LCM(s1, s2, m, n-1));
        }
    }
}
