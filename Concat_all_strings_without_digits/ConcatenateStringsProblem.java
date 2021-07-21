package Concat_all_strings_without_digits;

import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        // write your code with StringBuilder here
        StringBuilder str = new StringBuilder();
        for(String x:strings){
            str.append(x);
        }
        
        return str.toString().replaceAll("\\d", "" );
       
        
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}

