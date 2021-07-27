package Piece_of_alphabet;

import java.util.*;
class Piece_of_alphabet {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        char [] letter = str.toCharArray();
        boolean mark = true;
        for (int i = 1; i < letter.length; i++) {
            if (letter [i] - letter [i - 1] != 1) {
            mark = false;
               }
        }
        System.out.print(mark);
    }
}