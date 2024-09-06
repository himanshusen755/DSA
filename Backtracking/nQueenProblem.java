
public class nQueenProblem {
    public static void printSolution(int[][] board , int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    public static boolean isSafe(int board[][] , int row, int column , int n){
        int i , j;

        //chech on the left row
        for(i=0; i<column ; i++){
            if (board[row][i] == 1) {
                return false;
            }
        }
        //check for the upper dia in the left 
        for(i=row, j=column ; i>=0&&j>=0; i-- , j--){
            if (board[i][j]==1) {
                return false;
            }
        }
        // check for the lower diagonal in the left direction?
        for(i = row ,j=column ;i<n&&j>=0 ;i++,j--){
            if (board[i][j]==1) {
                return false;
            }
        }
        return true;
    }
    //function to solve n queen problem

    public static boolean nQueen(int[][] board , int column , int n ){
        //Base case - if you have placed all the Queen then return true
        if (column>=n) {
            return true;
        }
        
        //consider this column and try to place all the queen in all the rows one by one
        for(int i=0;i<n;i++){
            //check it is Safe or not
            if (isSafe(board, i , column, n)==true) {
                //place the queen in the board 
                board[i][column]=1;
                
            
            //Recursive calls to place all the Queen 
            if (nQueen(board, column+1, n) == true) {
                return true;
            }
            //If placing the Queen but not get solution then backtrack
        board[i][column] =0 ;
        }
        }
        //If it is not possible to place all the queen  in a row of the given column then return false
        return false;
    }
    public static void main(String[] args) {
        int [][] board = {
                    {0,0,0,0,0},
                    {0,0,0,0,0},
                    {0,0,0,0,0},
                    {0,0,0,0,0},
                    {0,0,0,0,0}

                    
        };
        if(nQueen(board, 0, board.length)== true){
            printSolution(board, board.length);
        }
        else{
            System.out.println("Solution doesnot exist");
        }
    }
}
