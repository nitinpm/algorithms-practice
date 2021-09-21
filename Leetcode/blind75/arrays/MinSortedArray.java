package Leetcode.blind75.arrays;

public class MinSortedArray {

    public static int findMin(int[] nums) {
        int lo = 0, hi = nums.length-1;

        if(nums.length == 1)
            return nums[0];

        if(nums[lo] < nums[hi])
            return nums[lo];

        return binarySearch(lo, hi, nums);
    }

    private static int binarySearch(int lo, int hi, int[] nums) {

        int mid = (lo + hi)/2;
        if(lo >= hi){
            return nums[lo];
        }

        if(nums[mid] < nums[hi]){
            return binarySearch(lo, mid, nums);
        } else{
            return binarySearch(mid+1, hi, nums);
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,6,1,2,3};

        System.out.println(findMin(nums));
    }
}
