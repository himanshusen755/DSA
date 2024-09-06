import java.util.*;
public class HashMapFunctioon {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();

        //Functionality of a put function
        hm.put(1, "Himanshu");
        hm.put(2, "Ananya");
        hm.put(3, "Aarshi");
        hm.put(5, "Iffat");
        hm.put(8, "Aryan");

        System.out.println("HashMap of the given data :" + hm);

        //Functionality of get function

        System.out.println(hm.get(3));

        //functionality of a contains key function 

        System.out.println(hm.containsKey(6));

        //Remove function

        hm.remove(1);
        System.out.println(hm);

        //Iterating using the for loop

        for (Map.Entry<Integer,String> e : hm.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }


    }
}