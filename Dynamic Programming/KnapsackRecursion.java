/**
 * KnapsackRecursion
 */
public class KnapsackRecursion {

    public static void main(String[] args) {
        int[] profit = {60,100,120};
        int[] weight = {10,20,30};

        int m = 50;
        int n =  profit.length;

        System.out.println("Maximum profit is : "  + knapsack(m,profit,weight,n));
    }
   //Function defination
   //Recursive Appoarch
   //Time complexity : O(2^n) -> Exponetial time complexity
    //Space complexity : 0(2^n)
    private static int knapsack(int m, int[] profit, int[] weight, int n) {
        //Base Case condition 
        if (n==0 || m==0) {
            return 0 ;
        }
        //Recursive Calls
        if (weight[n-1]>m) {
            //Exclude the object
            return knapsack(m, profit, weight, n-1);
        }
        else{
            //Max(exclude the object , include the object with profitt)
            return Math.max(knapsack(m, profit, weight, n-1), profit[n-1]+knapsack(m-weight[n-1], profit, weight, n-1));
        }
    }
}