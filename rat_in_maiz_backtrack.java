import java.util.*;

public class rat_in_maiz_backtrack {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }

        };

        // System.out.println(ret_path_obs2("",0,0,arr));

        // System.out.println(ret_path_obs("", 0, 0, arr));


        int [][] a = new int[3][3];

        printing_path_matrix("",0,0,a,1);
    }

    public static ArrayList<String> ret_path_obs2(String p, int i, int j, int[][] arr) {
        ArrayList<String> ans = new ArrayList<>();

        if (i == arr.length - 1 && j == arr[0].length - 1) {

            ans.add(p);
            return ans;
        }

        if (arr[i][j] == 0) // instead of this if(i< arr.length -1 && arr[i+1][j]==true)
            return ans; // it means if we visit wrong index the back out with making path

        if (i < arr.length - 1 && arr[i + 1][j] == 1) {
            arr[i][j] = 0; // marked as visited
            ans.addAll(ret_path_obs2(p + "D", i + 1, j, arr));
            arr[i][j] = 1; // backtrack

        }

        if (j < arr.length - 1 && arr[i][j + 1] == 1) {
            arr[i][j] = 0; // marksd as visited
            ans.addAll(ret_path_obs2(p + "R", i, j + 1, arr));
            arr[i][j] = 1; // backtrack
        }

        if (i > 0 && arr[i - 1][j] == 1) {
            arr[i][j] = 0; // marksd as visited
            ans.addAll(ret_path_obs2(p + "U", i - 1, j, arr));
            arr[i][j] = 1; // backtrack
        }

        if (j > 0 && arr[i][j - 1] == 1) {
            arr[i][j] = 0; // marksd as visited
            ans.addAll(ret_path_obs2(p + "L", i, j - 1, arr));
            arr[i][j] = 1; // backtrack
        }

        return ans;

    }

    // another way of writing the code

    public static ArrayList<String> ret_path_obs(String p, int i, int j, int[][] arr) {
        ArrayList<String> ans = new ArrayList<>();

        if (i == arr.length - 1 && j == arr[0].length - 1) {

            ans.add(p);
            return ans;
        }

        if (arr[i][j] == 0) // instead of this if(i< arr.length -1 && arr[i+1][j]==true)
            return ans; // it means if we visit wrong index the back out with making path

        arr[i][j] = 0; // marked as visited this is for all function

        if (i < arr.length - 1) {
            // arr[i][j]=0; // marksd as visited
            ans.addAll(ret_path_obs(p + "D", i + 1, j, arr));
            // arr[i][j]=1; // backtrack
        }

        if (j < arr.length - 1) {
            // arr[i][j]=0; // marksd as visited
            ans.addAll(ret_path_obs(p + "R", i, j + 1, arr));
            // arr[i][j]=1; // backtrack
        }

        if (i > 0) {
            // arr[i][j]=0; // marksd as visited
            ans.addAll(ret_path_obs(p + "U", i - 1, j, arr));
            // arr[i][j]=1; // backtrack
        }

        if (j > 0) {
            // arr[i][j]=0; // marksd as visited
            ans.addAll(ret_path_obs(p + "L", i, j - 1, arr));
            // arr[i][j]=1; // backtrack
        }

        arr[i][j] = 1; // backtrack this is also for all function call

        return ans;

    }







    // printing steps with path
    public static void printing_path_matrix(String p , int i,int j,int [][] arr,int step){
       
       if(i==arr.length-1&&j==arr[0].length-1){
        arr[i][j] = step;
          for (int[] ks : arr) {
          System.out.println(Arrays.toString(ks));
         }
         System.out.println();
         System.out.println();
         System.out.println(p);
         return ;
        }
        if(arr[i][j]!=0)
        return;
        
        arr[i][j]=step;  // marked as visited  this is for all function

         if(i< arr.length -1){
        printing_path_matrix(p+"D",i+1,j,arr,step+1);}

 
        if(j< arr.length -1  )
        printing_path_matrix(p+"R",i,j+1,arr,step+1);
       
        if(i>0 )
        printing_path_matrix(p+"U",i-1,j,arr,step+1);
       
        if(j>0 )
        printing_path_matrix(p+"L",i,j-1,arr,step+1);
      
         arr[i][j]=0; // backtrack this is also for all function call
        }

}
