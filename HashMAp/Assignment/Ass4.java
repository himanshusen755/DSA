package Assignment;
/*Q4. Given an array nums of size n, return the majority element. */
import java.util.TreeMap;

public class Ass4 {
    public static void main(String[] args) {
        int[] arr = {1,2,6,9,30,3};

        TreeMap<Integer , Integer> tm =new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            tm.put(arr[i],i);
        }
        System.out.println("Majority Element is : " + tm.lastKey());
    }
}
