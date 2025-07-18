public class Dice {
    public static void main(String[] args) {
    
    dice("", 4);
    // System.out println(diceRet(p:"", target: 4)) ;
   
    }
        
public static void dice(String p, int target) {
    if (target == 0) {
    System.out.println(p);
     return;
        }    
    

        for (int i = 1; i <=target && i<= 6; i++) {
            dice(p+i, target-i);
            
        }
    
    }

}
