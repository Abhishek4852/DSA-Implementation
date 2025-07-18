public class N_Knight_problem {
    public static void main(String[] args) {
    boolean [][] arr = new boolean[3][3];
    // horse_placing(arr, 0, 0, 4);
    System.out.println(horse_placing1(arr, 0, 0, 4));
    }

    public static void horse_placing(boolean [][]arr,int i,int j,int target){
        if(target ==0){
             display(arr);
            return;
        }

        if(i==arr.length-1&&j==arr.length)
        return;

            if(j==arr[0].length){
                horse_placing(arr,i+1,0,target);
                return;
            }
              
            if(issafe(arr,i,j)){
                arr[i][j]=true;
                horse_placing(arr,i,j+1,target-1);
                arr[i][j]=false;
            }

            horse_placing(arr, i, j+1, target);
        }
  
    private static boolean issafe(boolean[][] arr, int i, int j) {
        if(isvalid(arr,i-2,j-1)){
            if(arr[i-2][j-1])
            return false;
        }

        if(isvalid(arr,i-2,j+1)){
            if(arr[i-2][j+1])
            return false;
        }

        if(isvalid(arr,i-1,j-2)){
            if(arr[i-1][j-2])
            return false;
        }

        if(isvalid(arr,i-1,j+2)){
            if(arr[i-1][j+2])
            return false;
        }
       
   
   return true;
    }

    private static boolean isvalid(boolean[][] arr, int i, int j) {
      if(i>=0&& i<arr.length&& j>=0&& j<arr[0].length)
      return  true;

      return false;
    }

    public static void display(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[0].length; j++) {
             System.out.print(arr[i][j]+"  ");
         }
         System.out.println();
        }
        System.out.println();
        System.out.println();
     }


// this is for leetcode 
     public static int horse_placing1(boolean [][]arr,int i,int j,int target){
        if(target ==0){
             display(arr);
            return 1;
        }

        if(i==arr.length-1&&j==arr.length){
            if(target == 0)
            return 1;

            return 0;
        }
        
        int count =0;

            if(j==arr[0].length){
          count = count +   horse_placing1(arr,i+1,0,target);
                
                return count;
            }
             
            if(issafe(arr,i,j)){
                arr[i][j]=true;
              count = count +  horse_placing1(arr,i,j+1,target-1);
                arr[i][j]=false;
            }

          count = count +  horse_placing1(arr, i, j+1, target);
            return count;
        }
}
