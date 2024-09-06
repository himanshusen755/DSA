package Arrays;
/* */
public class Duplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,2,5,6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Element is :" + arr[i] +"  " +
                     "Locations of the elements" +"  " + i + " " + j);
                }
            }
        }  
    }
}
//Time Complexities = O(n^2)
//Space Complexities = O(1)
