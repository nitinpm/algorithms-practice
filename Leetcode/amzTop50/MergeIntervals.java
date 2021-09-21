package Leetcode.amzTop50;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        LinkedList<int[]> result =  new LinkedList<>();

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        System.out.println(Arrays.deepToString(intervals));

        for(int[] interval: intervals){
            if(result.isEmpty() || result.getLast()[1] < interval[1]){
                result.add(interval);
            } else{
                result.getLast()[1] = interval[1];
            }
        }


        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,9},{2,5},{19,20},{10,11},{12,20},{0,3},{0,1},{0,2}};
        merge(intervals);
    }
}
