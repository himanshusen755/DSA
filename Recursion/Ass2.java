// Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
// That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
// Constraints : 0<=n<=1e6
// Input1 : n = 10
// Output 1 : -5
// Explanation : 1-2+3-4+5-6+7-8+9-10 = -5

import java.util.Scanner;

public class Ass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which alternate num is required :");
        int a = sc.nextInt();
        int i = 1;
        int res = sum(a,i);
        System.out.println(res);
        sc.close();
    }

    private static int sum(int a, int i) {
        if (i==a+1) {
            return 0;
        }
        else{
            if (i%2==0) {
                return sum(a, i+1) - i;
            }
            else return sum(a, i+1) + i;
        }
    }
}
