//Previous code is a part of dynamic problem  that give solution but this is a true and false question 
//rat find solution or not;

import java.util.Arrays;

public class RAT1maze {
    public static boolean solveMaze(int[][] maze, int[][] solution , int x , int y , int n){
            //Base case condition 
        if (x==n-1 && y == n-1 && maze[x][y] == 1)  {
            solution[x][y]= 1;
            return true;
        }

        
        if (isSafe(maze, x, y, n)) {
            //Check if current block is already visited{}
            if(solution[x][y]==1) return false;
            
            //do
            solution[x][y]=1;
            
        
        //recurive
            if (solveMaze(maze, solution, x+1, y, n)) {
                return true;
            }
            if (solveMaze(maze, solution, x, y+1, n)) {
                return true;
            }
            if (solveMaze(maze, solution, x-1, y, n)) {
                return true;
            }
            if (solveMaze(maze, solution, x, y-1, n)) {
                return true;
            }
        //back track\
        solution[x][y]=0;
        return false;
        }
        return false;
    }
    public static boolean isSafe(int[][] maze , int x ,int y ,int n){
        if (x>=0 && x<n && y >=0 && y<n && maze[x][y]==1) { //Check the path validity for futher
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] maze = {
            {1,0,0,1},
            {1,1,1,0},
            {0,0,1,0},
            {0,0,1,0}
};
    int [][] solution = {
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}
                    };
    int len = maze.length;
    if (solveMaze(maze, solution, 0, 0, len)) {
        System.out.println(Arrays.deepToString(solution));
    }
    else{
        System.out.println("Solution is not found");
    }
    }
}
