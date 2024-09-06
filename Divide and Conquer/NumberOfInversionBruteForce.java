public class NumberOfInversionBruteForce {
    public static void main(String[] args) {
        int[] arr = {1,5,2,8,3,4};

        int n = arr.length;
        int res = 0 ;
        int count = inversionCount(arr,n ,0);

        System.out.println("The inversion count of the array is : " + count);
    }

    public static int inversionCount(int[] arr, int n , int count ) {
        
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] > arr[j]) {
                   count++;
                }
            }
        }
        return count;
    }
}
