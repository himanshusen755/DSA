/*Q1. Implement a Map in java which takes the input and print the list in sorted order based on key. 
Input: 5- Rahul, 7 Lakshman, 1 Ram, 4 Krrish, 2 Lakshay
Output: {1=Ram, 2=Lakshay, 4=Krrish, 5=Rahul, 7=lakshman} */

package Assignment;
import java.util.TreeMap;

public class Ass1 {
    public static void main(String[] args) {
        TreeMap<Integer , String > tm = new TreeMap<>();
        tm.put(5, "Rahul");
        tm.put(7, "Lakshman");
        tm.put(1, "Ram");
        tm.put(4, "Krish");
        tm.put(2, "Lakshay");

        System.out.println("Sorted according to the key is : " + tm);

    }
    
}