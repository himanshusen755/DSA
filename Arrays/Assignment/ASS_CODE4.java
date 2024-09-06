package Arrays.Assignment;
// Q4: Write a program to find out the second largest element in a given array. 
public class ASS_CODE4 {
    public static void main(String[] args) {
        int arr[] ={34,21,54,65,43,75,95,42,1,104,7,9,34};
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=max && arr[i]>=max2)  {
                max2 = arr[i];
            }
        }
        System.out.println("Second largest value is : " + max2);
            }
}
