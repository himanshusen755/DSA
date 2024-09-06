package Arrays.Assignment;
// Q1: Write a program to print the sum of all the elements present on even indices in the given array.
public class ASS_CODE1 {
    public static void main(String[] args) {
        int arr[] = {3,20,4,6,9};
        int sum = 0;

        for (int i = 0; i < arr.length; i+=2) {
                sum+=arr[i];
        }
        System.out.println(sum);
    }
}
