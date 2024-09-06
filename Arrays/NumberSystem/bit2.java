package Arrays.NumberSystem;
//Swap two number without using third variable
public class bit2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        a = a^b; // a = 5^7
        b = a^b; // b = 5^7^7 = 5
        a = a^b; // a = 5^7^5 = 7
    }
}
