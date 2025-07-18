public class pattern {
    public static void main(String[] args) {
        patterns(5,0);
    
    }
    public static void patterns(int r,int c){
    if(r==0)
    return ;
     if(r<c)
     return;

     System.out.print(" * ");
   if(r>c)
     patterns(r,c+1);
     else{
    System.out.println();
     patterns(r-1,0);
     }

    }
}
