
public class infinitesortedarray {
   public static void main(String[] args) {
    int [] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};

    //System.out.println(bsearch(arr, 17));
    System.out.println(bsearch2(arr,21,0,1));

    System.out.println(arr[21]);
    System.out.println("helo");

   }
   
   
  static int bsearch(int [] arr, int target){


    int start = 0;
    int end = 1;

    
     while(target > arr[end]){
       int temp = end+1;

       end = end+(end-start+1)*2;
       start = temp;
       
     }

     return binarysearch(arr,target,start,end);
     
       }
     
     
       private static int binarysearch(int[] arr, int target, int start, int end) {
         
            int mid = (start+end)/2;
           if(start <= end){
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target ) {
                return binarysearch(arr, target, start, mid-1);
            }
            else 
                return binarysearch(arr, target, mid+1, end);

        }

        return -1;
 
        }

//  with prevention of index out of bound
     static   int bsearch2(int [] arr,int target, int start, int end ){

        try{
            while(target > arr[end]){
                int temp = end+1;
         
                end = end+(end-start+1)*2;
                start = temp;
                
              }
        } catch(IndexOutOfBoundsException e){
            end = end-(end-start)/2;
            return bsearch2(arr, target, start, end);
        }

        return binarysearch(arr,target,start,end);
     }
  


}
