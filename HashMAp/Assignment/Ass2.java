/*Q2. Implement a Map in java which takes the input and print the list in sorted order based on value.
    Input: 5- Rahul, 7 Lakshman, 1 Ram, 4 Krrish, 2 Lakshay
    Output: {Krish=4,Lakshay=2,Lakshman=7,Rahul=5,Ram=1} */

package Assignment;
import java.util.*;
public class Ass2 {
    public static void main(String[] args) {
        TreeMap<String , Integer > tm = new TreeMap<>();
        tm.put("Rahul", 5);
        tm.put("Lakshman", 7);
        tm.put("Ram", 1);
        tm.put("Krrish", 4);
        tm.put("Lakshay", 2);

        System.out.println("Sorted based on key or names " + tm);
    }
}
