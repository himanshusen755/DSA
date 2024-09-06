package Arrays.NumberSystem;
// (N,i) check if ith bit is set or not  
public class bit7 {
    public static void main(String[] args) {
        int N = 25;
        int i = 2;
        int mask = 1<<i;
        if ((mask&N)==0) {
            System.out.println("It is not set bit");
        }
        else{
            System.out.println("It is a set bit");
        }
    }
}
