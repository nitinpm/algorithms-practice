package Leetcode.blind75.string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagramsBrute(String[] strs) {
        if(strs.length == 1)
            return Arrays.asList(Arrays.asList(strs[0]));

        boolean[] visited = new boolean[strs.length];
        List<List<String>> result = new ArrayList<>();
        List<String> anagramGroups;

        for(int i = 0; i < strs.length; i++){
            if(!visited[i]){
                anagramGroups = new ArrayList<>();
                anagramGroups.add(strs[i]);
                visited[i] = true;
                for(int j = i+1; j < strs.length; j++){
                    if(!visited[j] && isAnagram(strs[i], strs[j])){
                        anagramGroups.add(strs[j]);
                        visited[j] = true;
                    }
                }
                result.add(anagramGroups);
            }
        }

        return result;
    }

    public static List<List<String>> groupAnagramsSort(String[] strs) {
        if(strs.length == 1)
            return Arrays.asList(Arrays.asList(strs[0]));

        boolean[] visited = new boolean[strs.length];
        List<List<String>> result = new ArrayList<>();
        List<String> anagramGroups;

        HashMap<String, List<String>> sortedMap = new HashMap<>();

        for(String item: strs){
            char[] itemCharArr = item.toCharArray();
            Arrays.sort(itemCharArr);
            String temp = new String(itemCharArr);

            if (!sortedMap.containsKey(temp)) {
                sortedMap.put(temp, new ArrayList<>());
            }
            sortedMap.get(temp).add(item);
        }

        for(List<String> sortedMapValue: sortedMap.values()){
            result.add(sortedMapValue);
        }

        return result;
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

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

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        //List<List<String>> result = groupAnagramsBrute(strs);
        List<List<String>> result = groupAnagramsSort(strs);

        for(List<String> item: result){
            System.out.println(Arrays.toString(item.toArray()));
        }
    }
}
