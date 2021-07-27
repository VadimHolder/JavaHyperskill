package Palindrome;
import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = new StringBuilder(str1).reverse().toString();
        if (str1.equals(str2)){
            System.out.println("yes");
            
        } else System.out.println("no");
        
        
        
    }
}
