package Arrays.Assignment;
/*Q2: Write a program to traverse over the elements of the array using for each loop and print all even 
 elements*/
public class ASS_CODE2 {
    public static void main(String[] args) {
        int arr[] = {34,21,54,65,43};

        for (int i : arr) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
