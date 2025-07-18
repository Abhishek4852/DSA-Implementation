public class skip_char {
    public static void main(String[] args) {
        String str ="baccab";  // remove a form string by recursion

        System.out.println(skip(str));

        System.out.println(skip_apple("abcappledad"));

        System.out.println(reverse_apple("abcappledad"));
    }

    public static String skip(String str){
        if(str.isEmpty())
        return ""; // empty isliye return kiya hai kyoki yaha value char me store hoti hai or char+string = string 

        char c = str.charAt(0);

        if(c=='a' || c=='A')
        return skip(str.substring(1));

        else 
        return c + skip(str.substring(1));
    }
    public static String skip_apple(String str){
    
        if(str.isEmpty())
        return "";


         if(str.startsWith("apple"))
         return skip_apple(str.substring(5));
         
         
         else  
         return str.charAt(0)+skip_apple(str.substring(1));
    }


    public static String reverse_apple(String str){
    
        if(str.isEmpty())
        return "";


         if(str.startsWith("apple")){
            
         return "elppa"+reverse_apple(str.substring(5));
         } 
         else  

            return str.charAt(0)+reverse_apple(str.substring(1));
         }
}
