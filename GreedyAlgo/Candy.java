import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        int[] arr = {1,5,3,1};
        System.out.println(candyCount(arr));
    }

    private static int candyCount(int[] arr) {
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp, 1);

        //left to right
        for (int i = 1; i < n; i++) {
            if (arr[i]>arr[i-1]) {
                dp[i] = dp[i-1]+1;
            }
        }
        for(int i = n-2 ; i>=0 ; i--){
            if (arr[i] > arr[i+1] && dp[i] <= dp[i+1]) {
                dp[i] = dp[i+1] +1;
            }
        }
       int sum = Arrays.stream(dp).sum();
       return sum;
    }
    
}
