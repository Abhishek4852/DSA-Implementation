
import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        int a[] = { 2,2,2,24,6,2,5,9,2,2,2,3,2,};

         b_sort(a,a.length, 0);
       System.out.println(Arrays.toString(a));

    }
    public static int [] b_sort(int []a,int last,int i){
        if(last == 0 )
        return a;

        if(i < last-1){
            if(a[i]>a[i+1]){
             int temp = a[i];
             a[i]=a[i+1];
             a[i+1]=temp;
            }
            return b_sort(a,last,i+1);
        }
        else {
            return b_sort(a,last-1,0);
        }
    } 
}
