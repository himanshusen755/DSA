package Arrays;
import java.util.Arrays;
import java.util.Scanner;

/*Bubble sort 
 * Terms used in sorting
 * take 2 element and done sorting if ar[j]>arr[j+1]
 * done swapping
 * At first pass or iteration one maximum value over the array is at right most postion
 * now ab loop ek kaam bar chalega 
 */
public class BubbleSort {
    
    public static void BubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped =false;
            //This is done because at every iteration we get the biggest value right most side the
    //then we dont need to bar bar compare
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    // swap between  arr[j] to arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped =true;
                }
            }
            if (!swapped) { //Eska mtlb when ek bhi swap nhi hoga to value false se true ho jayege
                //wo andar jayega if codition is true and break the loop until the another itretion
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n  =  sc.nextInt();
        System.out.println("Enter the element of an array : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        //Function calling
        BubbleSort(arr);
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
        //Time complexity = O(n^2)
        //Space complexity = 0(1)
        //IT is a stable sorting algoritm and comparision based sorting algoritm
    }
}
