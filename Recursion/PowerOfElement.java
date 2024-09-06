import java.util.Scanner;

public class PowerOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        double a =sc.nextDouble();
        System.out.println("Enter the value of b");
        double b =sc.nextDouble(); //Double problem kyo kr raha hai 
        double result = powerOfElement(a,b);
        System.out.println("Power a^b = "   + result);
        sc.close();
    }

    private static double powerOfElement(double a, double b) {
        double finalresult=0;
        double result =0;
        if (b==1) {
            return a;
        }
        else{
            result = powerOfElement(a, b/2);
            finalresult = result*result;
        }
        if (b%2==0) {
            return finalresult;
        }
        else{
            return finalresult*a;
        }
    }
}
