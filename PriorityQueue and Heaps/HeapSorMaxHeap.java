public class HeapSorMaxHeap {
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void heapifyDelete(int[] arr , int n , int i){
        int largest = i;

        int l = 2*i + 1;
        int r = 2*i + 2;
        //Check if the left child is greater than the largest element 
        if (l<n && arr[l] > arr[largest]) {
            largest = l;
        }
        //Check if the right child is greater than the largets element 
        if (l<n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i ) {
            swap(arr, i, largest);

            heapifyDelete(arr, n , largest);
        }
    }

    public static void heapSort(int[] arr , int n){
        for (int i = n/2-1; i >= 0 ; i--) {
            heapifyDelete(arr, n, i);
        }
        for (int i = n-1; i > 0; i--) {
            swap(arr, i, 0);
            heapifyDelete(arr, i, 0);
        }
    }
    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {13,11,7,12,5};
        heapSort(arr,arr.length);
        printArr(arr, arr.length);
    }
}
