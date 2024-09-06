public class MatrixChainMultilpicatioRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        int n = arr.length;
        int i = 1;
        int j = n-1;
        System.out.println("Minimum number of operations : " + MCM(arr , i , j));
    }

    private static int MCM(int[] arr, int i, int j) {
        if (i==j) {
            return 0;
        }
        int minOpr = Integer.MAX_VALUE;
        for (int k = i; k < j ; k++) {
            int opr = MCM(arr , i , k) + MCM(arr, k+1, j) + (arr[i-1]*arr[k]*arr[j]);
            minOpr = Math.min(minOpr, opr);
        }
        return minOpr;
    }
}
