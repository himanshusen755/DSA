// Q3: Print the max value of the array [ 13, 1, -3, 22, 5].

public class Ass3 {
    public static void main(String[] args) {
        int [] arr = {13,1,-3,22,5 , 64};
        int n =arr.length;
        int res = Maximum(arr , n);
        System.out.println("Maximum value is :" + res);
        
    }

    private static int Maximum(int[] arr, int n) {
        if (n==1) {
            return arr[0];
        }
        else{
            return max(arr[n-1] , Maximum(arr, n-1));
        }
    }

    private static int max(int i, int maximum) {
        return i>maximum?i:maximum;
    }

    

}
