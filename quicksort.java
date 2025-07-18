import java.util.*;

public class quicksort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2};
       // quick_sort(arr,0,arr.length-1);

       mergesort(0, arr.length-2, arr);
        System.out.println(Arrays.toString(arr));
       // Arrays.sort(arr);
    }
    public static void quick_sort(int [] arr,int low,int high){
      
       if(low >= high)
       return;

       int s = low;
       int e = high;
       int mid = (s+e)/2;
       
       int pivot = arr[mid];


       while(s<=e){

        while(arr[s]<pivot)
        s++;

        while(arr[e]>pivot)
        e--;

        if(s<=e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
       
        // now call recursion to another half
    quick_sort(arr, low, e);
    quick_sort(arr, s, high);
       }


    }

    public static void mergesort(int low, int high, int []arr){
        if(high-low<=1){
            return;
        }

        
        int mid = (low+high)/2;

        mergesort(low, mid, arr);
        mergesort(mid+1, high, arr);
        merge1(low,mid,high,arr);
    }

    public static void merge1(int low,int mid,int high, int [] arr){
     
        int [] temp = new int[high-low+1];
        int i = low;
        int j = mid+1;
          int k =0;
        while(i<mid && j < high ){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i];
            }
            else{
                temp[k++]= arr[j];
            }
            
        }
        while(i<mid){
            temp[k++] = arr[i++];

        }

        while(j<high){
            temp[k++] = arr[j++];
        }
          k=0;
        for(int l = low; l <= high; l++){
arr[l] = temp[k++];
        }
    }

    

}
