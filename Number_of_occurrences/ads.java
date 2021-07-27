package Number_of_occurrences;
import java.util.*;
class Number_of_occurrences {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner (System.in);
        String first = sc.nextLine();
        String sub = sc.nextLine();
        int n = first.length();
        int s = first.replaceAll(sub,"").length();
        int count = (n-s)/sub.length();
        System.out.println(count);
        
    }
}