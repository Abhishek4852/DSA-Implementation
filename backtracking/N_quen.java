import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class N_quen {
    public static void main(String[] args) {
       boolean [][] board = new boolean[4][4];
    
       LocalTime t1 = LocalTime.now();

       System.out.println(count(board, 0));

       LocalTime t2 = LocalTime.now();
       
       Duration duration = Duration.between(t1, t2);
       System.out.println(duration); 
    }


    // this question returns the no. of ways how the n no. of queen can be placed in n*n matrix and we also print the matrix also 

    public static int count(boolean[][] board, int row){
        // if row goes last means we found one of the possible answer
        if(row == board.length){
            print_board(board);
            return 1;
        }
        int count = 0;
        for(int col=0;col<board[0].length;col++){
       
           if(isSafe(board,row,col)){
                board[row][col] = true;
                count += count(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
        
    }
                    
                    
    private static boolean isSafe(boolean[][] board, int row, int col) {

        // vertical checking 
        for(int i = 0; i<row; i++){
            if(board[i][col]){
                return false;
            }
        }

        // left diagonal checking
        int steps = Math.min(row,col);
        for (int i = 1; i <= steps; i++) {
            if(board[row-i][col-i]){
                return false;
            }            
        }
               
        // right diagonal checking
        int rsteps = Math.min(row,board.length-col-1);
        for (int i = 1; i <= rsteps; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
        
        
    private static void print_board(boolean[][] board) {
   
        for (boolean[] row : board) {
            for (boolean ele : row) {
                if(ele){
                    System.out.print(" "+'X'+" "); 
                }else{
                    System.out.print(" "+'O'+" "); 
                }
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
