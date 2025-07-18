// permutation means organization of things in diff - diff order 
// ex   "abc" = [[acb],[bca],[acb],[bac].......] are the permutation bus [ac, ab,ac, a] are not the permutation

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      //  str_permutation("", "abc");

     // System.out.println(str_permutation_return("", "abc"));

   //  int [] nums = {1,2,3};

    // arr_permutation(nums, 0, new ArrayList<>());

   //  System.out.println(arr_permutation_return(nums, 0,new ArrayList<>()));
//    List<String> letter = new ArrayList<>();
//    letter.add("");
//    letter.add("");
//    letter.add(2,"abc");
//    letter.add(3,"def");
//    letter.add(4,"ghi");
//    letter.add(5,"jkl");
//    letter.add(6,"mno");
//    letter.add(7,"pqrs");
//    letter.add(8,"tuv");
//    letter.add(9,"wxyz");
//    System.out.println(letter.get(8));
//    String an = letter.get(8);
   
// for(int i = 0 ; i<an.length();i++){
//     System.out.println(an.charAt(i));
//}

// System.out.println(letterCombinations("27"));

//Dice("",4);

    }

    // permutation with string 

    public static void str_permutation(String p, String up){
          if(up.isEmpty()){
            System.out.println(p);
            return;
          }

          char ch = up.charAt(0);

          for(int i =0;i<p.length()+1;i++){
            String first = p.substring(0,i);
            String second = p.substring(i);

            str_permutation(first+ch+second, up.substring(1));

          }
    }

    public static ArrayList<String> str_permutation_return(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> ans = new ArrayList<>();
           ans.add(p);
           return ans;
          }

          char ch = up.charAt(0);
      ArrayList<String> ans =  new ArrayList<>();
          for(int i =0;i<p.length()+1;i++){
            String first = p.substring(0,i);
            String second = p.substring(i);

            ans.addAll(str_permutation_return(first+ch+second, up.substring(1)));

          } 

          return ans;
    }

    public static void arr_permutation(int []nums, int i,ArrayList<Integer> p){
        if(i==nums.length){
         System.out.println(p);
         return;
        }
        int ch = nums[i];
               
        for(int j = 0; j<p.size()+1;j++){
         p.add(j,ch);
         arr_permutation(nums, i+1, p);
         p.remove(j);
        }
    }

    public static ArrayList<ArrayList<Integer>> arr_permutation_return(int []nums, int i,ArrayList<Integer> p){
        if(i==nums.length){
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
              ans.add(new ArrayList<>(p));
            return ans;
           }
           int ch = nums[i];
           ArrayList<ArrayList<Integer>> ans = new ArrayList<>();     
           for(int j = 0; j<p.size()+1;j++){
            p.add(j,ch);
           ans.addAll( arr_permutation_return(nums, i+1, p));
            p.remove(j);
           }

           return ans;
    }


    /// keyped dilaer 
    /// leetcode problem no. 17 
    
     public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();

            List<String> letter = new ArrayList<>();
            letter.add("");
            letter.add("");
    letter.add(2,"abc");
    letter.add(3,"def");
    letter.add(4,"ghi");
    letter.add(5,"jkl");
    letter.add(6,"mno");
    letter.add(7,"pqrs");
    letter.add(8,"tuv");
    letter.add(9,"wxyz");
        
        return letter1("",digits,letter);
    }

  
    
    public static List<String> letter1(String p,String up,List<String> ref){
        List<String> ans = new ArrayList<>();
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
     int digit = up.charAt(0)-'0';
     
     String key_str = ref.get(digit);

     for(int i=0; i<key_str.length();i++){
        char ch = key_str.charAt(i);
       ans.addAll( letter1(p+ch,up.substring(1),ref));
     }

    return ans;
    }


    // dice problem ==> we have given a target and we need to return the ways to make a target 
    // ex  target = 4 then we need to return [[1,3],[2,2][3,1][4], [1,1,1,1],[1,1,2],[1,2,1].........] 

    public static void Dice(ArrayList<Integer> p , int target){
        if(target == 0){
            if(p.size() == 3)
            System.out.println(p);
            return;
        }

        for(int i=1;i<=6 && i<=target ;i++){
            ArrayList<Integer> nlist = new ArrayList<>(p);
            nlist.add(i);
            Dice(nlist,target-i);
        }
    }
// static int count = 0;
//     public static void Dice(String p , int target){
//         if(target == 0 || p.length() >= 2){
//             if(p.length()== 2 && target == 0)
//             System.out.println(p);
//             return;
//         }

//         for(int i=1;i<=6 && i<=target ;i++){
           
//            Dice(p+i,target-i);
//            System.out.println("fn call"+count);
//            count+=1;
//         }
//     }

}