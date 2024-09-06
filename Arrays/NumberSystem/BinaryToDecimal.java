package Arrays.NumberSystem;
import java.util.Scanner;

public class BinaryToDecimal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array in which binary is stored: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the binary number inside the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        double decimal = 0 ;
        for (int i = n-1; i >=0; i--) {
            decimal = decimal + arr[i] * Math.pow(2, n-i-1);
        }
        System.out.println("Decimal" + decimal);
    }
}
