import java.util.*;
//GFG
class Solution {
    public static void solveMaze(ArrayList<String> ans , int r , int c , int[][] m , int n , boolean[][] vis , String p){
        if(r==n-1 && c==n-1 && m[r][c]==1){
            ans.add(p);
            return;
        }
        
        if(r>=0 && r<n && c>=0 && c<n ){
            if(vis[r][c]==true  || m[r][c]==0) return;
            //DLRU we can follow here in this question D-> Down , L-> Left , R-> Right , U -> Up 
            
            //GHUM RAHE HO VISTED KO TRUE MARKS KR DO
            vis[r][c]=true;
            solveMaze(ans , r+1 , c , m , n , vis , p +'D'); //DOWN 
            
            solveMaze(ans , r , c-1 , m , n ,vis ,p +'L'); //LEFT
            
            solveMaze(ans , r , c+1 , m , n ,vis ,p +'R'); //RIGHT
            
            solveMaze(ans , r-1 , c , m , n ,vis ,p +'U'); //UP
            
            //NOW when we pura visted for one soution then we have to unvisted it this is called backtracking 
            
            vis[r][c] = false;
        }
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] vis = new boolean[n][n];
        solveMaze(ans , 0 , 0 , m , n ,vis ,"");
        return ans;
    }
}

public class RatBy_Gladden {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            Solution obj = new Solution();
            ArrayList<String> res = new ArrayList<>();
            Collections.sort(res);
            if (res.size()>0) {
                for (int i = 0; i < res.size(); i++) {
                    System.out.print(res.get(i) + " ");
                }
                System.out.println();
            }
            else {
                System.out.println(-1);
            }
        }
    }
}