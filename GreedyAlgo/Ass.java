import java.util.Scanner;
class Ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which need to verify it is armstrong or not");
        int a = sc.nextInt();
        int order  = FindOrder(a);
        int result = armstrong(a,order);
        if (result == a) {
            System.out.println("Armstrong number :");
        }
        else{
            System.out.println("Not a armstrong number ");
        }
        sc.close();
    }

    private static int FindOrder(int a) {
        int sum  = 0;
        while (a!=0) {
            sum++;
            a=a/10;

        }
        return sum;
    }

    private static int armstrong(int a, int order) {
        int result ;
        int b;
        if (a==0) {
            return 0;
        }
        else{
            b = a%10;
            result = (int)Math.pow(b, order) + armstrong(a/10, order);
        }
        return result;
    }
}
