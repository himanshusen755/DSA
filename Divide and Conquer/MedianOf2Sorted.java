public class MedianOf2Sorted {
    public static void main(String[] args) {
        int[] arr1 = {1,4,7,10,12};
        int[] arr2 = {2,3,5,6,15};

        int m = arr1.length;
        int n = arr2.length;

        System.out.println("Median of two sorted arrays is : " );
        System.out.printf("%.4f" , median(arr1, arr2, m, n));
    }

    private static double median(int[] arr1, int[] arr2, int m, int n) {
        if (m>n) { // arr1 size > arr2 size
            return median(arr2, arr1, n, m); //Ensuring that binary search happen on the minimum size array
        }
        int low = 0 , high = m , medianPos = ((m+n) + 1)/2;

        while (low<=high) {
            int cut1 = (low + high )/2;
            int cut2 = medianPos-cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1-1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 -1 ];
            int r1 = (cut1 == m) ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = (cut2 == n) ? Integer.MAX_VALUE : arr2[cut2];

            if (l1<=r2 && l2<=r1) {
                if ((m+n)%2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2))/2.0;
                }
                else {
                    return Math.max(l1, l2);
                }
            }
            else if (l1>r2) {
                high = cut1 -1;
            }
            else {
                low = cut1+1;
            }
            
        }
        return 0.0;
    }

   
}
