package string;

public class Main {
    public static void main(String[] args) {
        
      //  System.out.println(skip("baccad"));

      System.out.println(skip_apple("abhisapplehek"));
    }

    public static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip(up.substring(1));
        }else{
            return ch+skip(up.substring(1));
        }
    }

    public static String skip_apple(String up){
        if(up.isEmpty()){
            return "";

        }

        if(up.startsWith("apple")){
            return skip_apple(up.substring(5));
        }else{
            return up.charAt(0)+skip_apple(up.substring(1));
        }
    }
}
