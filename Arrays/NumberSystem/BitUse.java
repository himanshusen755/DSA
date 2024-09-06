package Arrays.NumberSystem;

public class BitUse {

    public static void main(String[] args) {
        int num;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        num = sc.nextInt();
        if ((num & 1) == 0) {
            System.out.println("Even number ");
        }
        else{
            System.out.println("odd number ");
        }
    }
}
