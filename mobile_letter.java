import java.util.ArrayList;

public class mobile_letter {
    public static void main(String[] args) {
        // letter("","89");

     System.out.println(letter1("","89"));

    }
    public static void letter(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
     int digit = up.charAt(0)-'0';
     if(digit==7){
        for(int i=(digit-2)*3;i<(digit)*3-2;i++){
              char ch = (char)('a'+i);
            letter(p+ch,up.substring(1));
     }  }
     else if(digit == 8){
        for(int i=(digit-2)*3+1;i<(digit)*3-2;i++){
            char ch = (char)('a'+i);
          letter(p+ch,up.substring(1));
     }
         }
       else if(digit == 9){

        for(int i=(digit-2)*3+1;i<(digit)*3-1;i++){
            char ch = (char)('a'+i);
          letter(p+ch,up.substring(1));
     }
 }  
         
    else{   
         
         for(int i=(digit-2)*3;i<(digit-1)*3;i++){
     char ch = (char)('a'+i);
     letter(p+ch,up.substring(1));
     }
    }
    }


    public static ArrayList<String> letter1(String p,String up){
        ArrayList<String> ans = new ArrayList<>();
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
     int digit = up.charAt(0)-'0';
     if(digit==7){
        for(int i=(digit-2)*3;i<(digit)*3-2;i++){
              char ch = (char)('a'+i);
            ans.addAll((letter1(p+ch,up.substring(1))));
     }  }
     else if(digit == 8){
        for(int i=(digit-2)*3+1;i<(digit)*3-2;i++){
            char ch = (char)('a'+i);
            ans.addAll((letter1(p+ch,up.substring(1))));
     }
         }
       else if(digit == 9){

        for(int i=(digit-2)*3+1;i<(digit)*3-1;i++){
            char ch = (char)('a'+i);
            ans.addAll((letter1(p+ch,up.substring(1))));
     }
 }  
         
    else{   
         
         for(int i=(digit-2)*3;i<(digit-1)*3;i++){
     char ch = (char)('a'+i);
     ans.addAll((letter1(p+ch,up.substring(1))));
     }
    }

    return ans;         
    }


    
}

/*  most efficient algorithm
 
   public class KeyPadCombination {

    static void combination(String dig, String[] kp, String res) {
        if (dig.length() == 0) {
            System.out.println(res + "  ");
            return;
        }
        int currNum = dig.charAt(0) - '0';

        String currChoices = kp[currNum];
        for (int i = 0; i < currChoices.length(); i++) {
            combination(dig.substring(1), kp, res + currChoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        String dig = "23";
        String[] kp = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        combination(dig, kp, "");

    }
}
 
 */