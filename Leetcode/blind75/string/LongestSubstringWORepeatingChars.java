package Leetcode.blind75.string;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWORepeatingChars {

    public static int lengthOfLongestSubstring2(String s) {

        if(s.isEmpty())
            return 0;

        int result = 0, counter = 0;
        HashSet<Character> charSet = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(charSet.contains(c)){
                result = result > counter ? result : counter;
                counter = 1;
                charSet.clear();
            } else{
                counter++;
            }

            charSet.add(c);
        }


        return result > counter ? result : counter;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    private static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        char currChar;
        int result=0;
        HashMap<Character, Integer> charCurrIdxMap = new HashMap<>();

        while(j < s.length()){
            currChar = s.charAt(j);
            if(charCurrIdxMap.containsKey(currChar)){
                i = Math.max(charCurrIdxMap.get(currChar), i);
            }

            result = Math.max(result, j-i+1);
            charCurrIdxMap.put(currChar, j+1);

            j++;
        }

        return result;
    }
}
