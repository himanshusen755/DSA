public class Sudoko {
    public static void printSolution(int[][] grid , int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    public static boolean isSafe(int[][] grid , int row , int column , int num , int n){
        //row clash - row has a unique value

        for (int i = 0; i < n; i++) {
            //check if it is safe to assign the number or not
            if (grid[row][i]==num) {
                return false;
            }
        }
        //Column clash - column has a unique value
        for (int i = 0; i < n; i++) {
            //check if it is safe to assign the number or not
            if (grid[i][column]==num) {
                return false;
            }
        }
        //subgrid or box clash = it have a unique
        int sqrt =(int) Math.sqrt(n);
        int bocRow = row - row %sqrt;
        int boxCol = column - column%sqrt;
        for (int i = bocRow ;i<bocRow + sqrt; i++) {
            for (int j = boxCol; j < boxCol+sqrt; j++) {
                if (grid[i][j] == num) {
                    return false;
                }
            }
        }
        //if there is no clash then you are safe then return true
        return true;

    }
    public static boolean SodukoSolver(int[][] grid , int n){
        int row =-1;
        int column =-1;
        boolean isEmpty = true;

        for(int i = 0 ; i<n ; i++){
            for (int j = 0; j < n; j++) {
               if (grid[i][j]==0) {
                row =i;
                column = j;

                //we still have some value in the sudoko
                isEmpty =false;
                break;
               }
            }
            if (!isEmpty) {
                break;
            }
        }
        //No empty space should be left
        if (isEmpty) {
            return true;
        }
        //Backtrack for each and every row
        for (int num = 1; num <=9; num++) {
            if (isSafe(grid, row, column, num, n)==true) {
                grid[row][column] = num;
            
            
            if (SodukoSolver(grid,n)) {
                return true;
            }
            else{
                grid[row][column] =0;
            }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] grid = {
            {3,0,6,5,0,8,4,0,0},
            {5,2,0,0,0,0,0,0,0},
            {0,8,7,0,0,0,0,3,1},
            {0,0,3,0,1,0,0,8,0},
            {9,0,0,8,6,3,0,0,5},
            {0,5,0,0,9,0,6,0,0},
            {1,3,0,0,0,0,2,5,0},
            {0,0,0,0,0,0,0,7,4},
            {0,0,5,2,0,6,3,0,0}
        };
        if (SodukoSolver(grid, grid.length)) {
            printSolution(grid, grid.length);
        }
        else{
            System.out.println("No solution ");
        }
    }
}
