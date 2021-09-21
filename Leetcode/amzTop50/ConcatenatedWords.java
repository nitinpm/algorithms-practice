package Leetcode.amzTop50;

import java.util.ArrayList;
import java.util.List;

public class ConcatenatedWords {
    public static List<String> findAllConcatenatedWordsInADict(String[] words) {

        List<String> result = new ArrayList<>();
        for(String word: words){
            if(canConstruct(word, words))
                result.add(word);
        }

        return result;
    }

    private static boolean canConstruct(String target, String[] words) {
        if(target == "") return true;

        for(String word: words){
            if(target.startsWith(word) && !word.equals(target)){
                String suffix = target.substring(word.length());
                if(canConstruct(suffix, words))
                    return true;
            }
        }


        return false;
    }

    public static void main(String[] args) {

//        String test = "abcde";
//        String target = "abc";
//        System.out.println(test.substring(target.length()));
        String[] words = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        List<String> res = findAllConcatenatedWordsInADict(words);
        System.out.println(res);
    }
}
