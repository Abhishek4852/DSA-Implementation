

public class Main {
    public static void main(String[] args) {
        int [ ] arr = {1,3,4,5,6,7,8,9};

        int [] arr1 = {3,2,3,4,5,7,7,8,8};
        System.out.println(search(arr1, 8, 0));
        //System.out.println(is_sorted_array(arr1,1));
    }

    static boolean is_sorted_array(int []arr, int i){
         
       
        if(i == arr.length-1){
            return true;
        }

         return arr[i-1] > arr[i] && is_sorted_array(arr, i+1);
         

    }

    static int search(int [] arr, int target, int i){

        if(i == arr.length -1){
            return -1;
        }
        if ( arr[i] == target){
            return i;
        }
         return search(arr, target, i+1); 
    }
}
