package Arrays.NumberSystem;

import java.util.Scanner;

public class bit5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        L = xor(L-1);  
        R = xor(R);
        System.out.println(R^L);
    }

    private static int xor(int a) {
        if (a%4==0) { //0(1) approach
            return a;
           }
           else if (a%4==1) {
            return 1;
           }
           else if (a%4==2) {
            return a+1;
           }
           else if(a%4==3){
            return 0;
            }
        else{
            return 0;
        }
    }
}
