/**
 * InsertionMaxHeap
 */
public class InsertionMaxHeap {

    public static void main(String[] args) {
        int MAX = 100;
        int arr[] = new int[MAX];

        arr[0] = 100;
        arr[1] = 70;
        arr[2] = 60;
        arr[3] = 50;
        arr[4] = 55;
        int n = 5;
        System.out.println("Before insert operation : " );
        printArr(arr , n);

        int value = 80;
        n = insert(arr , n , value);
        System.out.println("After insertion : ");
        printArr(arr, n);
    }
    public static void heapify(int[] arr , int n , int i){
        //find parent by left = 2*parent +1
        int parent = (i-1)/2;

        /*Check if current node is greater than the root node , if yes then swap and call heapify */
        if (arr[parent] > 0) {
            if (arr[i] > arr[parent]) {
                swap(arr, i, parent);

                //recursively call the heapify for the parent node
                heapify(arr, n, parent);
            }
        }
    }
    public static int insert(int[] arr, int n, int value) {
        n++; //Increase the size of the heap

        //insert the element at the end of the heap
        arr[n-1] = value;

        //heapify the heap
        heapify(arr, n, n-1);

        return n;
        
    }

    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}