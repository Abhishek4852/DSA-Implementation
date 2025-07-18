import java.util.ArrayList;

public class Maize_problem {
    public static void main(String[] args) {


    //    int n = 3;

    //    System.out.println(count_ways(n,n));

        // System.out.println(ret_path("", n, n));

        //  System.out.println(ret_path1("", n, n));

        // System.out.println(ret_digonaly("", n, n));


        // let we have a boolean matrix and their is value false it means this is obstacle
    //     int rows =3;
    //     int cols = 3;
    //    boolean arr [][] = new boolean[rows][cols];

    //    for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < cols; j++) {
    //         arr[i][j] = true;
    //     } }
    //     arr[1][1]=false;



    //    System.out.println(count_ways_obs(arr,0,0) );
        //  System.out.println(ret_path_obs1("",0,0,arr));
    
    
      int [][] arr = {
        {1, 0, 0, 0},
        {1, 1, 0, 1}, 
        {1, 1, 0, 0},
        {0, 1, 1, 1}

      };

      System.out.println(ret_path_obs2("",0,0,arr));
         
        }





//  return number of ways to reach destination
    public static int count_ways(int i, int j){
        if(i==1||j==1)
        return 1;
       
        int count = 0;
       count = count+count_ways(i-1,j);
       count = count+count_ways(i , j-1);
       return count;
     }
    //  other way of returning the value but internally its same
     public static int count_ways1(int i, int j){
        if(i==1||j==1)
        return 1;
       
       int left = count_ways1(i-1,j);
       int right = count_ways1(i , j-1);
       return left+right;
     }





    //  return actual path of traversal              p is processed
    public static ArrayList<String> ret_path(String p , int i,int j){
        ArrayList<String> ans = new ArrayList<>();

        if(i==1||j==1){
            String ps = new String(p);
            if(i<j){
                int ct = j-i;  // if i=1 ,j=3 ther remaining two steps which is R , R
                while(ct>0){
                    ps = ps+"R";  // for adding remaining steps 
                    ct--;
                }
            }else{
                int nt = i-j;  // if i=3 ,j=1 ther remaining two steps which is D , D
                while(nt>0){
                    ps+="D";   // for adding remaining steps
                    nt--;
                }
            }
         ans.add(ps);
         return ans;
        }
       
        ans.addAll(ret_path(p+"D",i-1,j));

        ans.addAll(ret_path(p+"R",i,j-1));

        return ans;
                
    }





    //  return actual path of traversal more efficient             p is processed
    public static ArrayList<String> ret_path1(String p , int i,int j){
        ArrayList<String> ans = new ArrayList<>();

        if(i==1&&j==1){
          
         ans.add(p);
         return ans;
        }
       if(i>1)
        ans.addAll(ret_path1(p+"D",i-1,j));
        

        if(j>1)
        ans.addAll(ret_path1(p+"R",i,j-1));

        return ans;
                
    }
// add one more direction which is dioganaly
    public static ArrayList<String> ret_digonaly(String p , int i,int j){
        ArrayList<String> ans = new ArrayList<>();

        if(i==1&&j==1){
          
         ans.add(p);
         return ans;
        }
       if(i>1)
        ans.addAll(ret_digonaly(p+"V",i-1,j));
        

        if(j>1)
        ans.addAll(ret_digonaly(p+"H",i,j-1));
        
        if(i>1&& j>1)
        ans.addAll(ret_digonaly(p+"D",i-1,j-1));


        return ans;
                
    }





    // count number of ways when matrix contain obstacles 

    public static int count_ways_obs(boolean [][]arr,int i,int j){

       if(i == arr.length-1 || j == arr.length-1 ){
        return 1;
       }
        int count = 0;
       if(arr[i+1][j]==true) //checking next index should not contain obstacles
      count = count + count_ways_obs(arr,i+1,j);

      if(arr[i][j+1]==true)
      count = count + count_ways_obs(arr,i,j+1);

      return count;
    }




    // print path when matrix contain obstacles 
    public static ArrayList<String> ret_path_obs(String p , int i,int j,boolean [][] arr){
        ArrayList<String> ans = new ArrayList<>();

        if(i==arr.length-1&&j==arr[0].length-1){
          
         ans.add(p);
         return ans;
        }
       if(i< arr.length -1 && arr[i+1][j]==true) // here we checking that is next index should not obstacles
        ans.addAll(ret_path_obs(p+"D",i+1,j,arr));
        

        if(j< arr.length -1 && arr[i][j+1]==true) // here we checking that is next index should not obstacles
        ans.addAll(ret_path_obs(p+"R",i,j+1,arr));

        return ans;
                
    }




     // print path when matrix contain obstacles 
     public static ArrayList<String> ret_path_obs1(String p , int i,int j,boolean [][] arr){
        ArrayList<String> ans = new ArrayList<>();

        if(i==arr.length-1&&j==arr[0].length-1){
          
         ans.add(p);
         return ans;
        }
        
        if(!arr[i][j])  // instead of this if(i< arr.length -1 && arr[i+1][j]==true)
        return ans;    // it means if we visit wrong index the back out with making path  

       if(i< arr.length -1 )
        ans.addAll(ret_path_obs1(p+"D",i+1,j,arr));
        

        if(j< arr.length -1 )
        ans.addAll(ret_path_obs1(p+"R",i,j+1,arr));

        return ans;
                
    }


    public static ArrayList<String> ret_path_obs2(String p , int i,int j,int [][] arr){
        ArrayList<String> ans = new ArrayList<>();

        if(i==arr.length-1&&j==arr[0].length-1){
          
         ans.add(p);
         return ans;
        }
        
        if(arr[i][j]==0)  // instead of this if(i< arr.length -1 && arr[i+1][j]==true)
        return ans;    // it means if we visit wrong index the back out with making path  

       if(i< arr.length -1 && arr[i+1][j]==1){
        arr[i][j]=0;  // marked as visited 
        ans.addAll(ret_path_obs2(p+"D",i+1,j,arr));
        arr[i][j]=1;  // backtrack
    
        }

 
        if(j< arr.length -1 && arr[i][j+1]==1 ){
            arr[i][j]=0; // marksd as visited
        ans.addAll(ret_path_obs2(p+"R",i,j+1,arr));
        arr[i][j]=1; // backtrack
        }
        
        if(i>0 && arr[i-1][j]==1){
            arr[i][j]=0; // marksd as visited
        ans.addAll(ret_path_obs2(p+"U",i-1,j,arr));
        arr[i][j]=1; // backtrack
        }
        
         if(j>0 && arr[i][j-1]==1){
            arr[i][j]=0; // marksd as visited
        ans.addAll(ret_path_obs2(p+"L",i,j-1,arr));
        arr[i][j]=1; // backtrack
         }

        return ans;
                
    }
}
