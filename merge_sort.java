import java.util.*;

public class merge_sort {
  public static void main(String[] args) {
   int a[] =  {5,4,3,2,1};
   a = mergesort(a);
   System.out.println(Arrays.toString(a));
  }

  public static int [] mergesort(int []a){
    if(a.length == 1)
    return a;

    int mid = a.length/2;

    int []left = mergesort(Arrays.copyOfRange(a, 0,mid));
    int []right = mergesort(Arrays.copyOfRange(a, mid,a.length));

    return merge(left,right);


  }
  public static int [] merge(int []left,int []right){
   int [] temp = new int[left.length+right.length];

   int i=0,j=0,k=0;

   while(i<left.length && j<right.length){
    if(left[i]<right[j])
      temp[k++]=left[i++];
      else
      temp[k++]=right[j++];
   }
   while(i<left.length){
    temp[k++]=left[i++];
   }

   while(j<right.length){
    temp[k++]=right[j++];
   }
return temp;
  }
}
