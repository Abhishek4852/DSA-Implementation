

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     
       // ArrayList<String> ans = new ArrayList<>();
      //  subset("","abc",ans);
      //  System.out.println(ans);


//       Integer i = Integer.valueOf(null);
// System.out.println(i);
//       int a = i.intValue();
//       System.out.println(a);

int arr[] = {1,2,3};
List<List<Integer>> ans = subsets(arr);
System.out.println(ans);
    }
    public static void subset(String p, String up,ArrayList<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
        char ch = up.charAt(0);
        subset(p+ch,up.substring(1),ans);
        subset(p, up.substring(1),ans);
    }


    public static List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();

    ans.add(new ArrayList<>());
   

    for(int i = 0; i<nums.length;i++){
        int size = ans.size();
        for (int j =0;j < size;j++){
            List<Integer> subans = new ArrayList<>();
            subans.addAll(ans.get(j));
            subans.add(nums[i]);
            ans.add(subans);   
        }  
    }
  return ans;
    }
}
