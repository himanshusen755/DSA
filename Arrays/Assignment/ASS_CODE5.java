package Arrays.Assignment;
/*Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than 
its just left and just right neighbor*/
public class ASS_CODE5 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 4, 2, 3, 5, 7, 1 };
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
