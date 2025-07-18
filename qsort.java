import java.util.Arrays;

public class qsort {
    public static void main(String[] args) {
        
        
        int arr1 [] = {34,6,7,67,8,89,94,2,1,4,3445,6,6,78,5,3,21,34,45,6,8,90,67,4524,123,23,3,4,5467,7,32};


        quicksort(0,arr1.length-1 , arr1);
        System.out.println(Arrays.toString(arr1));
        
    }

   static void quicksort (int low, int high, int [] arr){

        if(low < high){
            int piviot = partation(low, high, arr);
            quicksort(low, piviot-1,arr);
            quicksort(piviot+1,high,arr);
        }
    }


   static int partation(int low, int high, int[] arr){
        int piviot = arr[low];

        int i = low;
        int j = high;

        while(i<j){
            while(arr[i]<= piviot && i< arr.length-1){
                i++;
            }

            while(arr[j]> piviot && j > -1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[low] = arr[j];
        arr[j] = piviot;

        return j;
            
        
    }
}
