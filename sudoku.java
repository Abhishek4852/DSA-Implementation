import java.util.Arrays;

public class sudoku {
    public static void main(String[] args) {
        
        
 int [][]arr = {
 {3, 0, 6, 5, 0, 8, 4, 0, 0},
 {5, 2, 0, 0, 0, 0, 0, 0, 0},
 {0, 8, 7, 0, 0, 0, 0, 3, 1},
 {0, 0, 3, 0, 1, 0, 0, 8, 0},
 {9, 0, 0, 8, 6, 3, 0, 0, 5},
 {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
 {1, 3, 0, 0, 0, 0, 2, 5, 0},
 {0, 0, 0, 0, 0, 0, 0, 7, 4},
 {0, 0, 5, 2, 0, 6, 3, 0, 0} 
};



char [][] charr = new char[arr.length][arr.length];
    for (int i = 0; i < charr.length; i++) {
        for (int j = 0; j < charr.length; j++) {
            if(arr[i][j]!=0)
            charr[i][j]=  (char)(arr[i][j]+'0');
            else 
            charr[i][j]=  '.';
        }
    }

    for (char[] cs : charr) {
        System.out.println(Arrays.toString(cs));
    }
System.out.println();
System.out.println();
   if( sudoku_solver_char(charr)){
    for (char[] cs : charr) {
        System.out.println(Arrays.toString(cs));
    }
   }

// for (int[] is : arr) {
//     System.out.println(Arrays.toString(is));
//  }
    }

    // private static void sudoku_solver(int[][] arr, int i,int j) {
    //     if(i==arr.length-1&&j==arr.length){
    //         for (int[] is : arr) {
    //             System.out.println(Arrays.toString(is));
    //          }
            
    //         return;
    //     }

    //     if (j == arr.length) {
    //         i++;
    //         j = 0;
    //     }

          
        
    //         if(not_empty(arr,i,j)){
    //             // checking which elemect should be fill
                
    //             for(int val = 1;val<=9;val++){
    //                 if(is_place(arr,i,j,val)){
    //                     arr[i][j] = val;
    //                     sudoku_solver(arr,i,j+1);
    //                     // backtrack if wrong value
    //                     arr[i][j]=0;
    //                 }
    //             }

    //         }
    //       sudoku_solver(arr, i, j+1);
       
    //     // else{
    //     //     sudoku_solver(arr, i+1, 0);
    //     // }

    // }

    private static boolean is_place(int [][] arr, int i, int j, int val) {

        // check horizontal
        for(int k = 0;k< arr.length;k++){
            if(arr[i][k]==val)
            return false;
        }


         // check vertically
         for(int k = 0;k< arr.length;k++){
            if(arr[k][j]==val)
            return false;
        }


        // check submatrix
        int row = i-i%3;
        int col = j-j%3;

        for(int k = row;k<row+3;k++){
            for(int l = col; l<col+3;l++){
                if(arr[k][l]==val)
                return false;
            }
        }


        return true;
    }

    // private static boolean not_empty(int[][] arr, int i, int j) {
    //  if(arr[i][j] == 0)
    //  return true;

    //  return false;
    // }

    private static boolean sudoku_solver1(int[][] arr) {
        int row =-1;
        int col =-1;
        boolean empty_left = true;
          
        for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j< arr.length; j++) {
                if(arr[i][j]==0){
                    row = i;
                    col = j;
                    empty_left=false;
                    break;
                }
              } 
              if(empty_left==false)
              break;          
        }

        if(empty_left)
        return true;

          
      
            for (int i = 1; i < 10; i++) {
                if(is_place(arr, row, col, i)){
                    arr[row][col]=i;
                    if(sudoku_solver1(arr)){
                        return true;
                    }else{
                        // backtrack
                        arr[row][col]=0;
                    }
                    
                }
            }
        
     return false;      

    }







    //  sudoku for character arrays 
    private static boolean sudoku_solver_char(char[][] arr) {
        int row =-1;
        int col =-1;
        boolean empty_left = true;
          
        for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j< arr.length; j++) {
                if(arr[i][j]=='.'){
                    row = i;
                    col = j;
                    empty_left=false;
                    break;
                }
              } 
              if(empty_left==false)
              break;          
        }

        if(empty_left)
        return true;

          
      
            for (char i = '1'; i <='9'; i++) {
                if(is_place_char(arr, row, col, i)){
                    arr[row][col]=i;
                    if(sudoku_solver_char(arr)){
                        return true;
                    }else{
                        // backtrack
                        arr[row][col]='.';
                    }
                    
                }
            }
        
     return false;      

    }


    private static boolean is_place_char(char [][] arr, int i, int j, char val) {

        // check horizontal
        for(int k = 0;k< arr.length;k++){
            if(arr[i][k]==val)
            return false;
        }


         // check vertically
         for(int k = 0;k< arr.length;k++){
            if(arr[k][j]==val)
            return false;
        }


        // check submatrix
        int row = i-i%3;
        int col = j-j%3;

        for(int k = row;k<row+3;k++){
            for(int l = col; l<col+3;l++){
                if(arr[k][l]==val)
                return false;
            }
        }


        return true;
    }

    
}
