import java.util.*;

public class TypesOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer , String> hm =  new HashMap<>();
        hm.put(1, "Ram");
        hm.put(4, "Ajay");
        hm.put(3, "Priya");
        hm.put(6, "Sam");

        System.out.println("HashMap is look like " + hm); //Here order of insertion is not preserved 

        LinkedHashMap<Integer , String> hm1 =  new LinkedHashMap<>();
        hm1.put(1, "Ram");
        hm1.put(4, "Ajay");
        hm1.put(3, "Priya");
        hm1.put(6, "Sam");
        hm1.put(5, "Prabal");

        System.out.println("LinkedHashMap is look like :" + hm1);

        //Sorted output on the basis of the keys we have the map

        TreeMap<Integer , String> tm = new TreeMap<>();
        tm.put(6, "Hari");
        tm.put(9, "Om");
        tm.put(1, "Ram");
        tm.put(3, "Shyam");
        tm.put(11, "Krishna");
        tm.put(5, "Govind");

        System.out.println(tm);
    }
}
