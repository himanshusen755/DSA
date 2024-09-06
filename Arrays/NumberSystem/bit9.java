package Arrays.NumberSystem;
//Clear the ith bit 
public class bit9 {
    public static void main(String[] args) {
        int n = 50;
        int i = 1;
        int mask = ~(1<<i);
        System.out.println(n&mask);
    }
}
