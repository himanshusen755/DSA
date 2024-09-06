import java.util.Scanner;

/**
 * SelectionProcedure
 */
public class SelectionProcedure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the kth position : ");
        int k = sc.nextInt();
        System.out.println("enter the array element : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int res = selectionProcedure(arr,0,n-1,k);
        System.out.println("Smallest element is : " + res);
        sc.close();
    }

    private static int selectionProcedure(int[] arr, int l, int h, int k) {

        int m = partition(arr, l , h);
        int n  = arr.length;

        if (m == k-1) {
            return arr[m];
        }
        else if (m<k-1) {
            return selectionProcedure(arr, m+1 , h, k);
        }
        else{
            return selectionProcedure(arr, l,m-1, k);
        }
       
    }

    private static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l ;
        for (int j = l+1; j <=h; j++) {
            if (arr[j]<=arr[i]) {
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
      }
      int temp = arr[i];
      arr[i] = arr[l];
      arr[l] =temp;
      return i;
    }
}