import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void main(String[] args) {
        // permutation("","abc");

        // System.out.println(premutation_ret("", "abc"));

        int[]up = {1,1,3,3};
//         List<List<Integer>> ans = permute(new ArrayList<>(), up, 0);
// for (List<Integer> list : ans) {
//      System.out.println(list);    
// }
// System.out.println(permutation_count("","abc"));

// List<Integer> list = new ArrayList<>();

// for (int i = 0; i < 10; i++) {
// list.add(i);
// }
// List<Integer> list2 = list.subList(0, 5);
// List<Integer> list3 = list.subList(5, 8);
// List<Integer> list4 = new ArrayList<>();
// list4.addAll(list2);
// list4.addAll(list3);
// list.add(3,5);
// System.out.println(list);

List<List<Integer>> ans =permute_duplicate(new ArrayList<>(),up,0,0);
for (List<Integer> list : ans) {
    System.out.println(list);
}
    }




// p=processed , up = unprocessed
public static void permutation(String p,String up){
   if(up.isEmpty()){
    System.out.print(p+" ");
    return;
   }
      char ch = up.charAt(0);

for (int i = 0; i <= p.length(); i++) {
     String first = p.substring(0, i);
    String second = p.substring(i,p.length());
     permutation(second+ch+first,up.substring(1));
    }
 }



 public static int permutation_count(String p,String up){
   
    if(up.isEmpty()){
        return 1;
    }
       char ch = up.charAt(0);
       int count = 0;
 for (int i = 0; i <= p.length(); i++) {
      String first = p.substring(0, i);
     String second = p.substring(i,p.length());
     count =count + permutation_count(second+ch+first,up.substring(1));
     
     }
     return count;
  }
 




// return all the permutation inn array list
public static ArrayList<String> premutation_ret(String p,String up){
    ArrayList<String> list = new ArrayList<>();
    if(up.isEmpty()){
        ArrayList<String> ans = new ArrayList<>();
        ans.add(p);
        return ans;
    }
    char ch = up.charAt(0);
    for (int i = 0; i <= p.length(); i++) {
      String f = p.substring(0, i);
      String s = p.substring(i);
      ArrayList<String> final_ans=premutation_ret(f+ch+s, up.substring(1));
   list.addAll(final_ans);
    }
    return list;
}



// permutation with on Arrray
 public static List<List<Integer>> permute(List<Integer> p,int[] up,int j) {
    List<List<Integer>> ans = new ArrayList<>();
    if(j>=up.length){
        ans.add(new ArrayList<>(p));
        return ans;
    }
int ch = up[j];

for (int i = 0; i <= p.size(); i++) {
    List<Integer> newlist =  new ArrayList<>(p);
   
    newlist.add(i,ch); // add ch in correct position in list 
    List<List<Integer>> temp = permute(newlist,up,j+1);
    ans.addAll(temp);
}
 return ans;       
    }



    // permutation with on Arrray with duplicate element  but wrong hai
 public static List<List<Integer>> permute_duplicate(List<Integer> p,int[] up,int j,int f_count) {
                                                        //f_count isliye hai taki function call ko km kr sake taki duplicate na aaye
    List<List<Integer>> ans = new ArrayList<>();
    if(j>=up.length){
        ans.add(new ArrayList<>(p));
        return ans;
    }
int ch = up[j];
if(!p.isEmpty()&&p.get(p.size()-1)==ch){

  if(p.size()<=2){
    f_count=0;
  }
  else
    f_count++;
}
 
 
for (int i = 0; i <= p.size()-f_count; i++) {
    List<Integer> newlist =  new ArrayList<>(p);
    if(!newlist.isEmpty())
        while(i<newlist.size()&&newlist.get(i)==ch)
        i++;
    
    newlist.add(i,ch); // add ch in correct position in list 
    List<List<Integer>> temp = permute_duplicate(newlist,up,j+1,f_count);
    ans.addAll(temp);
}
 return ans;       
    }
}
