
import java.util.*;

public class N_Queens_problem {

   static List<List<String>> ans = new ArrayList<>();
    public static void main(String[] args) {
//         String [][] arr = new String[4][4];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 arr[i][j] = ".";
//             }
//         }
//         arr[0][1]="Q";
// String [] ans = new String[4];
// String [] ans1 = new String[4];

//   for(int i =0;i<ans.length;i++){
//     ans[i]="";
//     ans1[i]="";
//   }

//  for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 ans[i] = ans[i]+arr[i][j];
//             }
//         }
//         // for (String[] strings : arr) {
//         //     System.out.println(Arrays.toString(strings));
//         // }

        

        // System.out.println(Arrays.toString(ans));


        boolean [][] arr= new boolean[4][4];

       
        System.out.println( nqueen4(arr,0));

        //  for (List<String> a : ans) {
        //  System.out.println(a);
        // }
    }


    public static int nqueen4(boolean [][] arr , int i){
        
        if(i==arr.length)
            return 1;
        int count =0;
        for(int j = 0;j<arr.length;j++){
            if(issafe4(arr,i,j)){
                arr[i][j]=true;
          count = count+ nqueen4(arr,i+1);
                arr[i][j]=false;
            }
        }
        return count;
        
    }
    public static boolean issafe4(boolean [][]arr,int i,int j){
        
//      checking queen in row upper side
        for(int k=i;k>=0;k--){
            if(arr[k][j])
                return false;
               }
        
//      checking queen in upper left diagonal    
        for(int k=i,l=j;k>=0&&l>=0;k--,l--){
            if(arr[k][l])
                return false;
               } 
        
//       checking queen in rigth upper diagonal
        for(int k=i,l=j;k>=0&&l<arr[0].length;k--,l++){
            if(arr[k][l])
                return false;
         }
        
        return true;
    }





    // there is a boolean array contain all false valus and w make the value true if it is right position for queen placing
    public static void nqueen(boolean[][] arr, int i){

        if(i== arr.length){
      display(arr);
      display2(arr);
        return;
        }

        for (int j1 = 0; j1< arr.length; j1++) {

            if(issafe(arr,i,j1)){
                arr[i][j1]=true;
                nqueen(arr,i+1); 
                arr[i][j1]=false;
            }
            
        }
    }

    private static void display2(boolean[][] arr) {
        List<String> subans = new ArrayList<>();

        for(int i = 0 ;i<arr.length;i++){
           
            String ele = new String("");
            for (int j = 0; j < arr.length; j++) {
                 if(arr[i][j])
                 ele+='Q';
                 else
                 ele+='.';
                 }
                 subans.add(ele);
             }
        ans.add(subans);
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



    public static boolean issafe(boolean [][]arr,int i,int j){
        
      
            for(int k=i; k>=0;k--)
            if(arr[k][j])
              return false;
     

           for(int k=i,l=j;k>=0&&l>=0;k--,l--)
           if(arr[k][l]) 
             return false;

         for(int k=i,l=j;k>=0&&l<arr[0].length;k--,l++)
         if(arr[k][l])
         return false;


         return true;
        
    }
}

