public class binary {
    public static void main(String[] args) {
        int a[]={5,6,7,8,9,10,2,3,4};
        System.out.println(brs(a,7,0,a.length-1));  // binary search for roted array

    }
    public static int brs(int []a,int ele,int s, int e){
        int mid = (s+e)/2;
       if(s>e)
       return -1;

       if(a[mid]==ele)
       return mid;

      if(a[s]<=a[mid]){
        if(ele >= a[s] && ele <= a[mid])
           e = mid-1;

        else s = mid+1;
      }
      if(ele >= a[mid] && ele <= a[e])
         s= mid+1;

         else
         e=mid-1;
         return brs(a,ele,s,e);
    
    }


    
}
