// Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10]
public class Ass4 {
    public static void main(String[] args) {
        int [] arr = {12,54,-89,65,75,112,73};
        int n = arr.length;
        int i = 0;
        int result  = sumOfArray(arr , n , i);
        System.out.println(result);
    }

    private static int sumOfArray(int[] arr, int n, int i) {
        int result = 0;
        if (i==n-1) {
            return arr[n-1];
        }
        else{
            result = arr[i] + sumOfArray(arr, n, i+1);
        }
        return result;
    }
}
