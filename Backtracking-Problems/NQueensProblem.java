/*First Way:  Place N queens on an N*N chessboard such that no 2 queens can attack each other
  Second Way: Count total number of ways to solve NQueens Problem
  Thrid Way:  Check if problem can be solved and print only 1 solution to NQueens Problem */

public class NQueensProblem {
    public static boolean isSafe(char board[][], int row,int col){

        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //Diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    //public static void NQueens(char board[][],int row)
    public static boolean NQueens(char board[][],int row){ // Third Way
        //base case
        if(row==board.length){
           //printBoard(board);
           count++; // second way
            return true;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
               // NQueens(board,row+1);function call
               if(NQueens(board,row+1)) // Third way function call
               {
                return true;
               }
                board[row][j]='x';//backtracking step
            }
        }
        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("--------ChessBoard--------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0; //second way

    public static void main(String args[]){
        int n=5;
        char board[][]=new char [n][n];

        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        //NQueens(board,0);
        if(NQueens(board,0)){

        //System.out.println("total ways to solve NQueens = "+count );
        System.out.println("Solution is possible");// Third Way
        printBoard(board);
    }
    else{
        System.out.println("Solution is not possible");
    }
}
    
    
}
