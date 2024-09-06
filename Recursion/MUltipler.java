import java.util.Scanner;

public class MUltipler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you have to find multiper");
        int n = sc.nextInt();
        System.out.println("Enter the number upto which yow want to find multiply");
        int k = sc.nextInt();
        table(n,k);
        sc.close();
    }

    private static void table(int n, int k) {
        if(k==1){
            System.out.print("\n" +n + " ");
            return ; //Backtracking
        }
        else{
            table(n , k-1);
            System.out.print(n*k + " ");
        }
    }
}
