/**
 * GasStation
 */
public class GasStation {

    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {2,1};

        System.out.println(findStarting(A ,B));
    }

    private static int findStarting(int[] A, int[] B) {
       int fuel = 0 , start = 0 , sum = 0;

       for (int i = 0; i < B.length; i++) {
            sum+=(A[i] -B[i]);
            fuel+=(A[i] -B[i]);

            if (fuel<0) {
                fuel =0;
                start = i+1;
            }


       }
       if (sum>=0) {
           return start % A.length;
       }
       else 
       {
        return -1;
       }
    } 
}