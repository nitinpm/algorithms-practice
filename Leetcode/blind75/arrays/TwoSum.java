package Leetcode.blind75.arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(numIndexMap.get(target - nums[i]) != null){
                result[0] = i;
                result[1] = numIndexMap.get(target - nums[i]);
            } else{
                numIndexMap.put(nums[i], i);
            }
        }


        return result;
    }
}
