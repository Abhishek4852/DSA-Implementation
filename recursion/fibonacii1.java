import java.util.*;
public class fibonacii1 {
    public static void fib(int a , int b ,int n){
        if(a > n)
        return;
        System.out.print(a+"  ");
        int sum = a+b;
        a=b;
        b=sum;
        fib(a,b,n);
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number upto which you want to print fibonacii list");
        int n = sc.nextInt();
        fib(0,1,n);   
    }
}
