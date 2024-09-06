package Arrays.Assignment;
// Write a program to calculate the maximum element in the array
public class ASS_CODE3 {
    public static void main(String[] args) {
        int arr[] = {34,21,54,65,43,75,95,42,1,104,7,9,34};
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]>=max) {
                max = arr[j];
            }
        }
        System.out.println(max);
        int max2 = Integer.MIN_VALUE;
        
        for (int i : arr) {
            max2 = Math.max(max, i);
        }
        System.out.println(max2);
    }
}
