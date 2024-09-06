
//Time complexity = 0(n logn)
//Space complexity = O(n)
//OutPlace sorting algorithm
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {50,20,40,90,88,11,13,19,27};
        int n = arr.length;

        System.out.println("Array before sorting is :" );
        printArr(arr ,n);
        System.out.println();

        mergeSort(arr,0,n-1);

        System.out.println("After sorting is : ");
        printArr(arr,n);
    }

    public static void mergeSort(int[] arr, int i, int j) {
        if( i < j){
            //Divide the arrray into two subproblem
            int mid = i + ((j - i)/2);

            //2 .Conquer the subproblem using recursion
            //Left subarray
            mergeSort(arr, i , mid );

            //Right side subarray 
            mergeSort(arr, mid+1, j);

            //Combining the solution of all subProblems
            mergeProcedure(arr,i,mid,j);
        }
    }
//Function  to do tthe combining Task
    public static void mergeProcedure(int[] arr, int l, int mid, int r) { //l - left index (i)
        //h - Higher index(j)
        int k ,i ,j;

        //Size of the left and Right Subarray

        //n1 - left subarray size
        //n2 - right subarray size
        int n1 = mid - l + 1; //mid - lower +1 is equal to number of element at the one side of the subarray
        int n2 =  r - mid  ; //higher - mid 
        
        //Copy the data into the left and right subarray
        int[] LS = new int[n1]; //LS =Left subarray
        int[] RS = new int[n2]; //LS =Right subarray

        for (i = 0; i < n1; i++) {
            LS[i] = arr[l+i];
        }
        for (j = 0; j < n2; j++) {
            RS[j] =  arr[mid + 1 + j];
        }

        //Comparison between the element in the left and right subarray
        i=0;
        j=0;
        k=l; //Why??

        while (i < n1 && j < n2) {
            if (LS[i] <=RS[j]) {
                arr[k] = LS[i];
                i = i +1 ;
            }
            else{
                arr[k] =RS[j];
                j = j+1;
            }
            k = k+1;
        }
        //Copying all the remaining element from the left subarray
        while (i < n1) {
            arr[k] = LS[i];
            i = i+1;
            k = k + 1 ;
        }
        //Copying all the remaining element from the Right subarray
        while (j<n2) {
            arr[k] =RS[j];
            j = j+1;
            k = k+1;
        }
    }
    //Function to disp arrays 
    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
