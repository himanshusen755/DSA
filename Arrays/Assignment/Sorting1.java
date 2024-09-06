package Arrays.Assignment;
// Q1. Write a program to sort an array in descending order using bubble sort.
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}
import java.util.Arrays;

public class Sorting1 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        BubbleSort1(arr);
        System.out.println("Sorted array is:");
        // reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void BubbleSort1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if(arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                    flag =true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
