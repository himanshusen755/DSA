import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {50,20,70,90,10,13,17,21};
        int n = arr.length;
        
        System.out.println("Array Before Sort : ");
        printArr(arr,n);

        quickSort(arr,0,n-1);

        System.out.println("After sorting : ");
        printArr(arr, n);

    }

    private static void quickSort(int[] arr, int l, int h) {
       if (l<h) {
           //1. Divide the array into subProblem
            int m = partition(arr,l,h);

            //2. Conquer those subproblem via recursion
            quickSort(arr, l, m-1); //left subHalf

            quickSort(arr, m+1 , h);//Right subHalf
       }
    }

    private static int partition(int[] arr, int l, int h) {
        int i = l;
        int pivot = arr[l]; //consider pivot as the first element in the array 

        for (int j = l+1 ; j <=h; j++) {
            //j- to take care of the bigger element than the pivot 
            //i - to care of the smalller element than the pivot
            if (arr[j]<=pivot) {
                //Increment
                i= i+1;

                //swap(arr[i] , arr[j])
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
           
        }
        
         //Swap(arr[i] ,arr[l])
            //to return the correct index of the p[ivot]
            int t  = arr[l];
            arr[l] = arr[i];
            arr[i] =t;
            
            return i;
        
    }

    private static void printArr(int[] arr, int n) {
        System.out.println(Arrays.toString(arr));
    }
}
