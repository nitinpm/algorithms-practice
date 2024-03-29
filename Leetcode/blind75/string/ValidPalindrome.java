package Leetcode.blind75.string;

import java.util.Locale;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;

        while(i < j){
            if(s.charAt(i++) != s.charAt(j--))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
