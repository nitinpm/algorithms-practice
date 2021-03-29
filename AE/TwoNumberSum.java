package AE;

import java.util.HashSet;

public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int[] result = new int[2];

        HashSet<Integer> input = new HashSet<>();

        for(int item: array){
            if(input.contains(targetSum - item)){
                result[0] = item;
                result[1] = targetSum - item;
                return result;
            } else{
                input.add(item);
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {

    }
}
