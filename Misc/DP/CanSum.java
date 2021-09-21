package Misc.DP;

import java.util.HashMap;
import java.util.Map;

public class CanSum {
    private static Map<Integer, Boolean> memo = new HashMap<>();

    public static boolean canSum(int target, int[] values){
        //if(memo.get(target) != null) return memo.get(target);

        if(target == 0) return true;
        if(target < 0)  return false;

        for(int item: values){
            if(canSum(target-item, values)) {
                //memo.put(target, true);
                return true;
            }
        }

       // memo.put(target, false);
        return false;
    }

    public static void main(String[] args) {
        int[] values = {7,14};
        System.out.println(canSum(300, values));
    }
}
