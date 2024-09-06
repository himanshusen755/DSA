package Arrays.NumberSystem;
//set the  ith bit of  a n
public class bit8 {
    public static void main(String[] args) {
        int N = 72;
        int i = 2;
        int mask = 1<<i;
        System.out.println(N|mask);
    }
}
