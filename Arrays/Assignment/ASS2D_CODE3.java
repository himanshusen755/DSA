package Arrays.Assignment;

import java.util.Scanner;

public class ASS2D_CODE3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number of rows :");
        int m = sc.nextInt();
        System.out.println("Enter the Number of Column :");
        int n = sc.nextInt();
        int[][] arr =  new int[m][n];
            for ( int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Diagonal elemnts is :");
            for ( int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(i==j || i+j==m-1){
                        System.out.print(arr[i][j]+" ");
                    }
                }
            }
            // As we have a square matrix, and we know this special property of Diagnol element, then for one diagonal both indices are same and for other the sum of both = m-1. 
    // So we will optimise our solution by just traversing one time and getitng both the values. To skip middle element twice we will add an check extra i.e. i!= m-1-i
    // for(i = 0 ; i < m ; i++){        
    //     System.out.print(arr[i][i] + "  ");

    //     if(i != m-1-i)
    //         System.out.print(arr[i][m-1-i] + "  ");
    //     }    
    // }  
            sc.close();
    }
}
