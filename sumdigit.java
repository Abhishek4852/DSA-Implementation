public class sumdigit{
    public static void main(String[] args) {
        // System.out.println(sumofdigit(12345));
      //  System.out.println(sum(12345,10000));
      // int n =00010;
      // System.out.println(n);
      // System.out.println(count(100004,0));
      System.out.println(countzeero(13,0));
    }

    private static int countzeero(int n, int c) {
     if(n==0)
     return c;

     if(n%10 == 0)
     c++;
     return countzeero(n/10,c);
    }

    public static int sumofdigit(int n){
        if(n>0 && n<=9)
          return n;
      
        int temp = sumofdigit(n/10);
       
         temp = temp*10+ n%10;
        return temp;
      }

      public static int sum(int n,int ct){
        if(n==0)
        return 0;

     int ans= (n%10)*ct+sum(n/10,ct/10);
    return ans;
      }
   
      public static int count(int n,int ct){
       
          if(n==0)
          return 0;

         

          int ans = count(n/10,ct);
          if(n%10==0)
          ans++;
        System.out.println(ans);
          return ans;

      }
}