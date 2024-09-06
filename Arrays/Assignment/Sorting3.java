package Arrays.Assignment;
import java.util.*;
/*Q3. WAP to sort an array in decreasing order using insertion sort
Input Array {3,5,1,6,0}
Output Array: {6, 5, 3, 1, 0} */
public class Sorting3 {
    public static void main(String[] args) {
        int arr[] = {15,46,16,45,75,13,11,76};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j]>arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
