public class MajorityElemnent {
    public static void main(String[] args) {
        int arr[] = {2,1,2};
        System.out.println(MC(arr));
    }

    private static int MC(int[] arr) {
        int me = arr[0];
        int mc = 1;
        for (int i = 1; i < arr.length; i++) {
            if (me == arr[i]) {
                mc++;
            }
            else{
                mc--;
                if (mc == 0) {
                    me = arr[i];
                    mc = 1;
                }
            }
           
        }
        return me;
    }
}
