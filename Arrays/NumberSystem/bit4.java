package Arrays.NumberSystem;
//Given a n  print the Xor of all between 1-N

import java.util.Scanner;

public class bit4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       
    //    for (int i = 1; i <= a; i++) {
    //        xor = xor^i;
    //    }  but this is not needed because of complexity 
       if (a%4==0) { //0(1) approach
        System.out.println(a);
       }
       else if (a%4==1) {
        System.out.println(1);
       }
       else if (a%4==2) {
        System.out.println(a+1);
       }
       else if(a%4==3){
        System.out.println(0);
        }
    sc.close();
    }
    
}
