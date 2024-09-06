package Arrays;

import java.util.Scanner;

public class FindingLowerBound {
    public static int FindingLowerBound(int[] a , int x){
        int low = 0;
        //This is nothing but modified binary search algo in which we check the mid element left side that the same element is present or not
        //In this approach we have to find in the sorted array only 
        //Time complexity is 0(log n)
        //Space complexity is constant
        int high = a.length-1;
        int result = -1;
        while(low<=high){
            //In order to avoid overflow constraint 
            int mid = low +(high-low)/2;
            if (a[mid]==x) {
                result = mid;
                //Traverse to the left side of the array
                high = mid -1;
            }
            else if(a[mid]>x) {
                high = mid - 1;
            }
            else if (a[mid]< x) {
                low = mid +1;
            }
        }
        return result;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n  =  sc.nextInt();
        System.out.println("Enter the element of an array : ");
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] =sc.nextInt();
        }
        System.out.println("Enter the target Element of an array");
        int target = sc.nextInt();

        //Function Calling step 
        int result  = FindingLowerBound(a , target);
        if (result == -1) {
            System.out.println("Element is not present in the array");
        }
        else System.out.println("Element first occurence  is present in the index = " + result);
        sc.close();
    }
}
