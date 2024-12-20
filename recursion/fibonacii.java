import java.util.*;
public class fibonacii {
    public static int fib(int n){
        if(n == 1)
        return 1;
        if(n <= 0)
        return 0;
        
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the tern that you  want ");
               int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
