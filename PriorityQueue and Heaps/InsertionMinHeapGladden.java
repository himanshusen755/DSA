public class InsertionMinHeapGladden { // MAX HEAP 
    static int size = 0;
    static int[] heap = new int[100];


    public static void heapify(){
        int i = size-1;
        //If parent is smaller than swap
        while (i>0 && heap[(i-1)/2]<heap[i]) { //Parent is smaller than i
            //Swap
            swap((i-1)/2 , i);
            i = (i-1)/2; // I = parent 
        }
    }

    public static void insert(int x){
        size++;

        //Insert element the last position to maintain CBT
        heap[size-1] = x;

        heapify();
    }
    public static void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    private static void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public static void main(String[] args) {
        insert(50);
        insert(30);
        insert(40);
        insert(10);
        insert(5);
        insert(20);
        insert(30);
        print();
        insert( 60);
        print();
    }
}
