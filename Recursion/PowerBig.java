import java.math.*;
import java.util.Scanner;

public class PowerBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        BigInteger a  = sc.nextBigInteger();
        int b  = sc.nextInt();

        BigInteger result = powerFind(a,b);
        System.out.println("power of an elemnt is = " + result);
        sc.close();

    }

    private static BigInteger powerFind(BigInteger a, int b) {
            BigInteger res , finalres;
        if (b==1) {
            return a;
        } else {
            res = powerFind(a , b/2);
            finalres = res.multiply(res);
        }
        if (b % 2 == 0) {
            return finalres;
        }
        else return a.multiply(finalres);
    }
}
