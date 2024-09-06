public class DeleteHeapGladden {
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
    public static int  delete(){
        // Replace root with last element 
        int elem = heap[0];
        heap[0] = heap[size-1];
        size--;
        int i =0; 
        while (i < (size-1)/2) { //because of the limit of i reach to parent node  //Last parent pe rokna hai
            //because child ke further child nhi honge then index out of bound hogya
            //Swap when child is greater
            if (heap[2*i + 1 ] > heap[i] || heap[2*i + 1] > heap[i]) {
                int max = (heap[2*i+1] > heap[2*i + 2]) ? 2*i +1 : 2*i+2;
                swap(i, max);
                i = max;
            } 
        }

        return elem;
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
        // print();
        insert( 60);
        // print();
        int d = delete();
        System.out.println(d);
        print();

    }
}
