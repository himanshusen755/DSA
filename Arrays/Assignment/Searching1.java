package Arrays.Assignment;
/*Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element, 
else print “Element not found in array”. Input the size of array, array from user and the element X from user. 
Use Linear Search to find the element. */

import java.util.Scanner;
public class Searching1 {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of array : ");
       int n = sc.nextInt();
       System.out.println("Enter the element of the array : ");
       int arr[] = new int[n];
       for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
       } 
       System.out.println("Enter the element which have to find :");
       int target = sc.nextInt();
       int result = LinearSearch(arr , target);
       System.out.println("Index of element : " + result);

       sc.close();
    }

    private static int LinearSearch(int[] arr, int target) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                result = i;
                break;
            }
        }
        return result;
    }
}
