public class sudoku_problem {
    public static void main(String[] args) {
      char [][] arr ;
        sudoku(arr,0,0);
    }

    private static void sudoku(char[][] arr, int i, int j) {
       if(i == arr.length && j == arr.length)
       for (char[] cs : arr) {
        System.out.println(cs);
       }
       return;
    
       if(j==arr.length && i == arr.length-1)
       return;

     if(j== arr.length){
        sudoku(arr,i+1,0);
        
     }


       if(not_contain(arr,i , j)){

        for(int no = 1; no<10;no++){
        if(issafe(arr,i,j,no)){
            char c_no = int_to_char(i);
            arr[i][j]= c_no;
            sudoku(arr,i,j+1);
            arr[i][j]='.';
        }

        }
       }
       else sudoku(arr,i,j+1);

      
    }

    private static boolean issafe(char[][] arr, int i, int j, int no) {
         
        for(int )
    }

    private static boolean not_contain(char[][] arr, int i, int j) {
     if(arr[i][j]=='.')
     return true;

     return false;
    }
    
    
}
