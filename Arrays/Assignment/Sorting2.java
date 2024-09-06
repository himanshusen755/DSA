package Arrays.Assignment;
import java.util.Arrays;
/*Q2. WAP to sort an array in descending order using selection sort
Input Array {3,5,1,6,0}
Output Array: {6, 5, 3, 1, 0} */
public class Sorting2 {
   public static void main(String[] args) {
        int [] arr = {15,46,16,45,75,13,11,76};
        selectionSort(arr);
        // reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max_idx =i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[max_idx]) {
                    max_idx = j ;
                }
            }
            if (max_idx!=i) {
                int temp = arr[i];
                arr[i] = arr[max_idx];
                arr[max_idx] = temp;
            }
        }
    }
}
