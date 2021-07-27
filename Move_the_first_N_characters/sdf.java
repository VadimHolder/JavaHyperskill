package Move_the_first_N_characters;

import java.util.*;
class Move_the_first_N_characters {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        if (n<=str.length()){
        String x = str.substring(0,n);
        String newStr = str.replace(x,"");
        System.out.println(newStr+x);
    } else System.out.println(str);
        
    }
}
