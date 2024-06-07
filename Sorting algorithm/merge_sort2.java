import java.util.Arrays;

public class merge_sort2 {
    public static void main(String[] args) {
          int a[] =  {5,4,3,2,1};
    mergesort(a,0,a.length);
   System.out.println(Arrays.toString(a));
    }
    public static void mergesort(int []a,int low,int high){
        if(high-low==1)
        return;
    
        int mid = (low+high)/2;
    
        mergesort(a,low,mid);
        mergesort(a,mid,high);
    
         merge(a,low,mid,high);
    
    
      }
      public static void merge(int []a,int low,int mid,int high){
       int [] temp = new int[high - low];
    
       int i=low,j=mid,k=0;
    
       while(i<mid && j<high){
        if(a[i]<a[j])
          temp[k++]=a[i++];
          else
          temp[k++]=a[j++];
       }
       while(i<mid){
        temp[k++]=a[i++];
       }
    
       while(j<high){
        temp[k++]=a[j++];
       }
         for (int k2 = 0; k2 < temp.length; k2++) {
            a[low+k2] = temp[k2];
         }
      }
}
