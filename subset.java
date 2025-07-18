import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        // sub_set("","abc");
    //    System.out.println(sub_set1("", "abc"));
    // System.out.println(sub_set_ascii("", "abc"));
    int arr[]={1,2,3};
    List<List<Integer>> sub = subsets(new ArrayList<>(), arr, 0);
        for (List<Integer> list : sub) {
            System.out.println(list);
        }
    }
    public static void sub_set(String prossed,String unprossed){
        if(unprossed.isEmpty()){
            System.out.print(prossed+"  ");
            return;
        }
        
    
    char ch = unprossed.charAt(0);
   
    sub_set(prossed+ch, unprossed.substring(1));

    sub_set(prossed,unprossed.substring(1));

    
    }
//    return all sets in ArrayList
    public static ArrayList <String> sub_set1(String prossed,String unprossed){

        ArrayList <String> ans = new ArrayList<String>();
        if(unprossed.isEmpty()){
            ans.add(unprossed);
            return ans;
        }
        
    
    char ch = unprossed.charAt(0);
   
   sub_set(prossed+ch, unprossed.substring(1));

   sub_set(prossed,unprossed.substring(1));
  return ans;
    
    }

    // with ascii value 
    public static ArrayList <String> sub_set_ascii(String prossed,String unprossed){

        
        if(unprossed.isEmpty()){
            ArrayList <String> ans = new ArrayList<>();
            ans.add(prossed);
            return ans;
        }
        
    
    char ch = unprossed.charAt(0);
   
    ArrayList <String> first=sub_set_ascii(prossed+ch, unprossed.substring(1));

    ArrayList <String> second = sub_set_ascii(prossed,unprossed.substring(1));

    ArrayList <String>third =sub_set_ascii(prossed+(ch+0),unprossed.substring(1));
// prossed+(ch+0) it add ascii value of ch in proced string 


    first.addAll(second);
    first.addAll(third);
    return first;
    
    }

// sets of array
  public static List<List<Integer>> subsets( List<Integer> p,int[] up,int i) {
   
    if(i>=up.length){
        List<List<Integer>> sub = new ArrayList<>();
        sub.add(new ArrayList<>(p));
         return sub;
     }
       int ch = up[i];
         i++;
         p.add(ch);
         List<List<Integer>> first =   subsets(p,up,i);

         if (!p.isEmpty()) {
            p.remove(p.size() - 1);
        }
        List<List<Integer>> second =   subsets(p,up,i);

first.addAll(second);
return first;

    }
   
}
