package Leetcode.blind75.string;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] charCountMap = new int[256];

        for(char c: s.toCharArray()){
            charCountMap[c]++;
        }

        for(char c: t.toCharArray()){
            charCountMap[c]--;
        }

        for(int count: charCountMap){
            if(count != 0)
                return false;
        }

        return true;
    }
}
