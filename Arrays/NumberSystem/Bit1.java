package Arrays.NumberSystem;
// Q5. Given an integer array, duplicates are present in it in a way that all duplicates appear an even 
// number of times except one which appears an odd number of times. Find that odd appearing 
// element in linear time and without using any extra memory.
// For example,
// Input : arr[] = [4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3]
// Output : The odd occurring element is 4
public class Bit1 {
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor^arr[i];
        }
        System.out.println(xor);
    }
}
