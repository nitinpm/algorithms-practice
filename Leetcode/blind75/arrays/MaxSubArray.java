package Leetcode.blind75.arrays;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)
            return nums[0];

        int maxSubArraySum = nums[0];
        int curSubArraySum = nums[0];

        for(int i = 1; i < nums.length; i++){
            int num = nums[i];
            curSubArraySum = Math.max(num, curSubArraySum + num);
            maxSubArraySum = Math.max(maxSubArraySum, curSubArraySum);
        }


        return maxSubArraySum;
    }
}
