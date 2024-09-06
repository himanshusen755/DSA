import java.util.ArrayList;
import java.util.Arrays;

public class SringSequence {
    public static void printSequence(int [] arr , int ind , ArrayList<Integer> tempArray){
        //Base case 
        if (ind == arr.length) {
            //print the subsequence but dont print empty subsequence
            if (tempArray.size()>0) {
                System.out.println(tempArray);
            }
            return;
        }
        //Recursive calls
        
            //Include
            printSequence(arr, ind+1, tempArray);
            //add the value in tempArray
            tempArray.add(arr[ind]);

            printSequence(arr, ind+1, tempArray);
            tempArray.remove(tempArray.size()-1); //Remove the last value

       
    }
    public static void main(String[] args) {
      int [] arr = {1,2,3};
      System.out.println("For the array " + Arrays.toString(arr));
      printSequence(arr, 0,new ArrayList<Integer>());
    }
}
