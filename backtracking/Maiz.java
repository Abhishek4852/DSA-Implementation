import java.util.ArrayList;

public class Maiz {


    //  this file cover the maiz problem and alll releted concepts
    public static void main(String[] args) {
       // System.out.println(count(3,3));

       //path("",3,3);

      // System.out.println(path_return("",3,3));

     // diagonaly_path("", 3, 3);

                  boolean [][] matrix = { {true, true, true },
                                          {true, true, true },
                                          {true, true, true },    };

    // path_with_obstacals("",0,0,matrix);

   // System.out.println(path_with_obstacals_return("",0,0,matrix));

  // allpath1("", 0, 0, matrix);

  allpath_matrix("", 0, 0, matrix, 1);
  
                                        
    }

    // we have given the matrix of r*c  and we are on the first index of matrix and we count the no. of ways to reach the very last index of matrix 
    // rule is we can traverse only right and down. (not left and up) 
    public static int count(int r,int c){

        // in this fun we consider 3,3 is start index and 1,1 is last index 
        if(r == 1 || c == 1){
            return 1;
        }

        int right = 0;
        int left = 0;
        right = right+count(r-1,c);
        left = left+count(r,c-1);

        return right+left;
    }

    // now this time we need to print the full path to reach the last index 
    public static void path(String p,int r, int c){
        if(r==1 && c == 1){
            System.out.println(p);
            return;
        }

        
        if(c>1){
            path(p+'D',r,c-1);
        }
        if(r>1){
            path(p+'R',r-1,c);
        }

    }
    // return the path in arraylist 
    public static ArrayList<String> path_return(String p,int r, int c){
        
        if(r==1 && c==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> final_ans = new ArrayList<>();

        if(c>1){
            final_ans.addAll(path_return(p+'D',r,c-1));
        }
        if(r>1){
            final_ans.addAll(path_return(p+'R',r-1,c));
        }
        return final_ans;
    }

    // in this time we add one more direcion that is diagonaly 
    //  for this we subtract 1 from both row and col simulteneously 
    // we siply print the path 

    public static void diagonaly_path(String p, int r, int c){
        if(r==1 && c == 1){
            System.out.println(p);
            return;
        }

       
        if(c>1){
            diagonaly_path(p+'D',r,c-1);
        }
        if(r>1){
            diagonaly_path(p+'R',r-1,c);
        }

        if(r>1 && c>1)
        diagonaly_path(p+'d',r-1,c-1);
       
    }


    // now this time we have some obstacals in some of the cells of metrix and for this we have given boolean array and obstacles represented by false value 
    // for example  boolean [][] matrix = { {true, true, true },
    //                                      {true, false, true },
    //                                      {true, true, true },    }
    // means we cannot go on index 1,1 
    // here we also print the path only 
    public static void path_with_obstacals(String p,int r, int c, boolean [][] mat){
        if(r==mat[0].length-1 && c == mat.length-1){
            System.out.println(p);
            return;
        }

        // here we are checking wheather the next cell is obstacals or not. if not then only make function call other wise not 
        if(c<mat.length-1 && mat[r][c+1]){
            path_with_obstacals(p+'D',r,c+1,mat);
        }
        if(r<mat.length-1 && mat[r+1][c]){
            path_with_obstacals(p+'R',r+1,c,mat);
        }

    }

    // here we return the path in the araylist 
    public static ArrayList<String> path_with_obstacals_return(String p,int r, int c, boolean [][] mat){
        if(r==mat.length-1 && c == mat[0].length-1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> final_ans = new ArrayList<>();
        // here we are checking wheather the next cell is obstacals or not. if not then only make function call other wise not 
        if(c<mat[0].length-1 && mat[r][c+1]){
            final_ans.addAll( path_with_obstacals_return(p+'D',r,c+1,mat));
        }
        if(r<mat.length-1 && mat[r+1][c]){
            final_ans.addAll( path_with_obstacals_return(p+'R',r+1,c,mat));
        }

        return final_ans;

    }

    //  now backtracking starts 
    // problem what if we can go any of the diraction that is up,down,left ,right, digonally at that time in some case went to starting position and then again 
    // on the same path that couse infinite recursion calls
    // we can solve this problem by keeping the track of cells that are visited 
    // for this we can take boolean 2D matrix initially it contain all true cells and as we go just make to false 
    // and when we returned back just change to its orignal position means true and this changing back to its initial position is called backtracking
    
    public static void allpath(String p, int r, int c, boolean [] [] board){ /// little bit wrong code below code is fully corcted 

        if(r == board.length -1 && c == board[0].length -1){
            System.out.println(p);
            return;
        }


        // goto right 
        if(c<board[0].length -1 && board[r][c+1]){
            board[r][c+1] = false;
            allpath(p+'R', r, c+1, board);
            board[r][c+1] = true;
        }

        // go down
        if(r<board.length -1 && board[r+1][c]){
            board[r+1][c] = false;
            allpath(p+'D', r+1, c, board);
            board[r+1][c] = true;

        }
    
        // go left
        if(c>0 && board[r][c-1]){
            board[r][c-1] = false;
            allpath(p+'L', r, c-1, board);
            board[r][c-1] = true;

        }

        //go up
        if(r>0 && board[r-1][c]){
            board[r-1][c] = false;
            allpath(p+'U', r-1, c, board);
            board[r-1][c] = true;

        }



    }

    // we can replace the these multiple time true false 
    // means means after went ont the cell then make changes 

    public static void allpath1(String p, int r, int c, boolean [] [] board){

        if(r == board.length -1 && c == board[0].length -1){
            System.out.println(p);
            return;
        }
       
        if(!board[r][c]){  // means if current cell is false then return back means dont make further call for current call
            return;
        }
       
       board[r][c] = false; // means make the current cell to false 
        // goto right 
        if(c<board[0].length -1 ){
            allpath1(p+'R', r, c+1, board);
        }

        // go down
        if(r<board.length -1){
            allpath1(p+'D', r+1, c, board);

        }
    
        // go left
        if(c>0){
            allpath1(p+'L', r, c-1, board);

        }

        //go up
        if(r>0 ){
            allpath1(p+'U', r-1, c, board);

        }

       // when the function call goes out of the stack at that time control comes here
       // here we make the board as it was 

       board[r][c] = true;

    }

   static int [][] path_matrix = new int[3][3];

    // now in this question we print the path matrix also 
    public static void allpath_matrix(String p, int r, int c, boolean [] [] board,int count){

        if(r == board.length -1 && c == board[0].length -1){
           // System.out.println(p);
           path_matrix[r][c] = count;
           print_matrix();
            return;
        }
       
        if(!board[r][c]){  // means if current cell is false then return back means dont make further call for current call
            return;
        }
       
       board[r][c] = false; // means make the current cell to false 
       path_matrix[r][c] = count;
        // goto right 
        if(c<board[0].length -1 ){
            allpath_matrix(p+'R', r, c+1, board,count+1);
        }

        // go down
        if(r<board.length -1){
            allpath_matrix(p+'D', r+1, c, board,count+1);

        }
    
        // go left
        if(c>0){
            allpath_matrix(p+'L', r, c-1, board,count+1);

        }

        //go up
        if(r>0 ){
            allpath_matrix(p+'U', r-1, c, board,count+1);

        }

       // when the function call goes out of the stack at that time control comes here
       // here we make the board as it was 

       board[r][c] = true;
       path_matrix[r][c] = 0;


    }

    private static void print_matrix(){
        for (int[] col : path_matrix) {
            for (int ele : col) {
                System.out.print(" "+ele+" ");
                
            }
            System.out.println();
            
          }

          System.out.println();
          System.out.println();
          System.out.println();
        
    }

}