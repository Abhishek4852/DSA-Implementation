import java.util.*;

public class selectionsort {
    public static void main(String[] args) {
        int a[] = {4,8,4,6,9,8,9,6,4,5,77,4,6,46,7};
        s_sort(a,0,1);

        System.out.println(Arrays.toString(a));
    }
    public static void s_sort(int []a,int i, int j){
        if(i == a.length-1 )
        return;

        if(i<j && j<a.length){
          if(a[i]>a[j]){
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
          }
          s_sort(a,i,j+1);
        }
        else
            s_sort(a,i+1,i+2);
    
    }
}
