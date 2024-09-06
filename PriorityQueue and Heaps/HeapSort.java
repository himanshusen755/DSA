public class HeapSort {
    static int[] heap = new int[100];
    static int n = 0;
    public static void swap(int i , int j){
        int temp = heap[i];
        heap[i] =  heap[j];
        heap[j] = temp;
    }
    public static void disp(){
        for (int i = 0; i < n; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    public static void insert(int val){
        n++;
        heap[n-1] = val;
        
        buildHeap();
    }
    public static void heapify(int n , int i){
        int largest = i;
        int lf = 2*i +1;
        int rf = 2*i +2;

        if (lf<n && heap[lf]>heap[largest]) {
            largest = lf;
        }
        if (rf<n && heap[rf]>heap[largest]) {
            largest = rf;
        }
        if (largest != i) {
            swap(i, largest);
            heapify(n, largest);
        }
    }
    public static void buildHeap(){
        int i = n-1;
        while (i>0 && heap[(i-1)/2]<heap[i]) {
            swap((i-1)/2, i);
            i = (i-1)/2;
        }
    }
    public static void HeapSort(){
        buildHeap();

        for (int i = n-1 ; i >= 0; i--) {
            swap(i, 0);
            heapify(i, 0);
        }
    }
    public static void main(String[] args) {
        insert(1);
        insert(3);
        insert(5);
        insert(4);
        insert(6);
        insert(13);
        insert(10);
        insert(9);
        insert(8);
        insert(15);
        insert(17);

        HeapSort();

        disp();

    }
}
