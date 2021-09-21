package Leetcode.amzTop50;

import com.sun.deploy.util.StringUtils;

import java.lang.reflect.Array;
import java.util.*;

public class ReorderLogFiles {

    public static String[] reorderLogFiles(String[] logs) {

//        List<String> digitLogs = new ArrayList<>();
//        List<String[]> alphaLogs = new ArrayList<>();
//        List<String> result = new ArrayList<>();

        Collections.sort(Arrays.asList(logs), new LogComaparator());

//        for(String log: logs){
//            if(isDigit(log)){
//                digitLogs.add(log);
//            } else{
//                alphaLogs.add(log.split(" ", 2));
//            }
//        }
//
//
//        Collections.sort(alphaLogs, (a,b) -> a[1].compareTo(b[1]) == 0 ? a[0].compareTo(b[0]) : a[1].compareTo(b[1]));
//
//        for(String[] item: alphaLogs){
//            result.add(String.join(" ", item));
//        }
//
//        result.addAll(digitLogs);

        //return result.stream().toArray(String[]::new);

        return logs;
    }

    private static boolean isDigit(String log) {
        String[] logSplit = log.split(" ");

        return logSplit[1].matches("\\d+");
    }

    public static void main(String[] args) {
        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        System.out.println(Arrays.toString(reorderLogFiles(logs)));
    }

    public static class LogComaparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {

            String[] item1 = o1.split(" ", 2);
            String[] item2 = o2.split(" ", 2);

            boolean isNumeric1 = Character.isDigit(item1[1].charAt(0));
            boolean isNumeric2 = Character.isDigit(item2[1].charAt(0));

            int result;

            if(!isNumeric1 && !isNumeric2){
                result = item1[1].compareTo(item2[1]);
                if(result == 0){
                    return item1[0].compareTo(item2[0]);
                }

                return result;
            }

            if(!isNumeric1 && isNumeric2){
                return -1;
            } else if(isNumeric1 && !isNumeric2){
                return 1;
            } else{
                return 0;
            }
        }
    }
}
