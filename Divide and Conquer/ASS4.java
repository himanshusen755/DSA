/*Q4. Given two arrays of equal size n and an integer k. The task is to permute both arrays such that 
the sum of their corresponding element is greater than or equal to k i.e a[i] + b[i] >= k. The task is 
to print “Yes” if any such permutation exists, otherwise print “No”. */

import java.util.Arrays;
import java.util.Collections;

public class ASS4 {
    public static void main(String[] args) {
        int [] a = {2, 1, 3};
        int b[] = { 7, 6, 9 };

        int n = a.length;

        int k = 10;

        if (isPossible(a,b,n,k)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }

    private static boolean isPossible(int[] a, int[] b, int n, int k) {
        Arrays.sort(b);
        Arrays.sort(a);

        for (int i = 0; i < b.length/2; i++) {
            int temp = b[i];
            b[i] = b[n - i -1];
            b[b.length-i-1] = temp;
        }

        for (int i = 0; i < n; i++) {
            if (a[i] + b[i] < k) {
                return false;
            }
        }
        return true;

    }
}
