import java.util.*;

public class array {
    public static void main(String[] args) {
        // int arr [] = {32,4,7,8,4,23,67,64,34,56,43,23,435,53,15,23};
    //   System.out.println(arr.length);
    //     System.out.println(isorted(arr ,0));
    //     System.out.println(linear_search(arr,0, 5));

        // ArrayList<Integer> aa = new ArrayList<>();

        // System.out.println(find_all_index(arr,0,23,aa));
   int[] arr = {1,23,2,23,23};

        System.out.println(f(arr,0,23));
    }

    private static ArrayList<Integer> f(int[] arr, int i, int ele) {
        ArrayList <Integer> list = new ArrayList<>();
        if(i==arr.length)
        return list;

        if(arr[i]==ele)
        list.add(i);

ArrayList<Integer> all_list= f(arr, i+1, ele);
    list.addAll(all_list);
    return list;
    }

    private static ArrayList<Integer> find_all_index(int[] arr, int i, int ele, ArrayList<Integer> aa){
           if(i == arr.length)
           return aa;

           if(arr[i]==ele)
           aa.add(i);

           return find_all_index(arr, i+1, ele, aa);
    } 
     

    private static int linear_search(int[] arr, int i,int ele) {
          if(i==arr.length)
          return -1;

          if(arr[i]==ele)
           return i;
           return linear_search(arr, i+1, ele);
    }

    private static boolean isorted(int[] arr,int i) {
        if(i+1>=arr.length)
        return true;

        if(arr[i]>arr[i+1])
         return false;

         return isorted(arr,i+1);
    }
}
