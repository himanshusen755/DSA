package Arrays.NumberSystem;

import java.util.ArrayList;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 39;
        ArrayList a = new ArrayList<Integer>();
        int base = 2;
        while (decimal!=1) {
             int i = decimal%2;
             decimal = decimal / 2;
             a.add(i);
        }
        a.add(decimal);
        a.toArray();
        for (int i = a.size() - 1 ; i >=0; i++) {
            
        }
    }
}
