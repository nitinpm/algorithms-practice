package Leetcode.blind75.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1)
            return false;

        Set<Integer> numSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(numSet.contains(nums[i])){
                return true;
            } else{
                numSet.add(nums[i]);
            }
        }

        return false;
    }
}
