import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int a [] = {5 , 4 ,3 ,8,3,8,9,5,4,2,3,5,6,9,345,5,45,65,6,7,34};

        System.out.println(Arrays.toString(a));
        
        // linear search 

        for(int i = 0; i < a.length;  i++){
           for (int j = i; j< a.length; j++){
            if (a[i] > a[j]){
                // swap 
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
           }
        }
        System.out.println(Arrays.toString(a));


    // bubble short 
    // largest element in the last always 

    int arr [] = { 43,5,4,23,23,5,56,6,7,865,54,3,5,6,7,440,443,556,6,45,34,3,54,56,6745,43,3,4565,7,4567,7,0};

    for(int i = 0; i < arr.length; i++ ){
        for( int j = 1; j< arr.length - i; j++){
            if(arr[j-1] > arr[j]){ // swap
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
    }

System.out.println(Arrays.toString(arr));

// insertion sort 

int arr1 [] = {34,6,7,67,8,89,94,2,1,4,3445,6,6,78,5,3,21,34,45,6,8,90,67,4524,123,23,3,4,5467,7,32};

// logic element shift towards left side if right side element is gratert then left side 

for(int i = 1;i< arr1.length; i++){
    for(int j = 0; j<i; j++){
        if(arr1[j] > arr1[i]){
            int temp = arr1[i];
            for( int k = i; k>j; k--){
               arr1[k] = arr1[k-1];
            }
            arr1[j] = temp;
        }
    }
}



System.out.println(Arrays.toString(arr1));

// quick sort 
// logic => pic the piviot and and put it on the correct place 








    }
}
