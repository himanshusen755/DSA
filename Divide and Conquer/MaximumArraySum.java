public class MaximumArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;

        int max_sum = maxSubArray(arr,0,n-1);
        System.out.println("Sum is : " + max_sum);
    }

    private static int maxSubArray(int[] arr, int l, int h) {
        //Invalid Range : low is greater than high
        if (l>h) {
            return Integer.MIN_VALUE;
        }
        //Base case : Only one element
        if (l==h) {
            return arr[l];
        }

        //Find middle element 
        int mid = l + (h-l)/2;

        /*Return maximum of the following three
         * possible cases :
         * a) Maximum subarray sum in left half(L to mid-1)
         * b) Maximum subarray sum in right half(mid+1 to H)
         * c) Maximum subarray sum such that the subarray crosses the midpoint - combined sum
         */
        return Math.max(Math.max(maxSubArray(arr, l, mid-1), maxSubArray(arr, mid+1, h)), maxCrossingSum(arr,l,mid,h));
    }

    private static int maxCrossingSum(int[] arr, int l, int mid, int h) {
        //Find the maximum possible sum in array[]
        //sum that arr[m] is part of it

        // Include elements on left of mid.
        int sum =0;
        int LS = Integer.MIN_VALUE;
        for (int i = mid ; i >=l; i--) {
            sum = sum +arr[i];
            if (sum>LS) {
                LS = sum;
            }
        }
        sum =0;
        int RS = Integer.MIN_VALUE;
        for (int i = mid; i <=h; i++) {
            sum = sum + arr[i];
            if (RS<sum) {
                RS = sum;
            }
        }

        //Return sum of elements on left 
        //and right of mid
        //returning only Left_sum + right_sum will fail for [-2,1]

        return Math.max(LS + RS - arr[mid], Math.max(LS, RS));
    }
}
