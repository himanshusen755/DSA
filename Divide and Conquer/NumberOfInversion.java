import java.util.Arrays;

public class NumberOfInversion {
    public static void main(String[] args) {
        int[] arr = {1,5,2,8,3,4};
        int n = arr.length;

        int Countopt = inversionCount(arr, 0,n-1);

        System.out.println("No of inversion is "  + Countopt);

    }

    public static int inversionCount(int[] arr, int l , int h) {
        int count = 0;
        //Divide the array into 2 subproblems 
        if(l<h){
            int mid = l + (h - l)/2;

            //Conquer the subproblem
            count+= inversionCount(arr, l, mid);
            count+= inversionCount(arr, mid+1, h);

            //Merger procedure - combine ssoluntion
            count+= MergeProcedure(arr,l,mid,h);

        }
        return count;
    }

    private static int MergeProcedure(int[] arr, int l, int mid, int h) {
        int swap = 0;
        //create Left and Right subarray4
        int[] LS = Arrays.copyOfRange(arr, l, mid+1);
        int[] RS = Arrays.copyOfRange(arr, mid+1, h+1);

        int i =0 ,j=0 ,k=0;
        while (i<LS.length && j<RS.length) {
            if (LS[i] <= RS[j]) {
                arr[k++] = LS[i++];
            }
            else{
                arr[k++] = RS[j++];
                //Now we need to calculate the number of swaps
                swap += (mid+1) - (l+i); 
            }
        }
        //Copy all the remaining element 
        while(i<LS.length){
            arr[k++] = LS[i++];
        }
        while (j<RS.length) {
            arr[k++] =RS[j++];
        }
        return swap;
    }
}
