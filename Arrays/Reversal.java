package Arrays;
/* Here we can use the half array for the complexities issue 
 * Time Complexites = O(n)
   Space Complexities = O(1)
 */
public class Reversal {
    public static void main(String[] args) {
        int [] arr = {1,5,9,63,41,7,52,4,6,77};
        int n = arr.length;
        int temp;

        for(int i = 0 ; i< n/2 ; i++){
            //Swap the elements between arr [i] and arr [n-1-i]
             temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println("Reversal of an array");
        for (int i : arr) {
            System.out.print(i + "->");
        }

        // Time Complexites = O(n)
        //Space Complexities = O(1)
    }  
}
