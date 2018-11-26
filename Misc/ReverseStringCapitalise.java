package Misc; /**
 * Program: REVERSE a string and capitalise the first letter of each word
 */

import java.util.Scanner;

public class ReverseStringCapitalise {
    public static void main(String args[]) {
        String input;
        Scanner in = new Scanner(System.in);
        //while(in.hasNextLine()){
        input = in.nextLine();
        input = new StringBuilder(input).reverse().toString();

        StringBuilder result = new StringBuilder();
        for(String str: input.split(" ")){
            String rev = new StringBuilder(str).toString();
            rev = rev.toLowerCase();
            rev = Character.toUpperCase(rev.charAt(0)) + rev.substring(1);
            result.append(rev).append(" ");
        }

        System.out.println(result.toString());
    }
}