import java.util.Scanner;

public class digitSum {
   static int sum = 0;
    public static int digit_sum(int n  ){
        if(n<=0){
            return 0;
        }
        int dig = n%10;
        sum+=dig;
        n=n/10;
         digit_sum(n);
         return sum;
    }
// return without use external veriable 
    public static int digit_sum1(int n, int sum1){
        if(n<=0){
            return sum1;
        }
    
        int dig = n%10;
        sum1+=dig;
        n=n/10;
        return  digit_sum1(n,sum1);
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the no ");
               int n = sc.nextInt();
            //    System.out.println(digit_sum(n));

            System.out.println(digit_sum1(n,0));
    }
}
