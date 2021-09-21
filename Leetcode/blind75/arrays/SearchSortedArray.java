package Leetcode.blind75.arrays;

public class SearchSortedArray {
    public static int search(int[] nums, int target) {

        if(nums.length == 1)
            return (nums[0] == target ? target : -1);

        int lo= 0, hi = nums.length - 1, mid = 0;

        while(lo<hi){
            mid = (lo+hi)/2;

            if(nums[mid] == target)
                return mid;

            if(nums[mid] > nums[lo]) {
                if(target < nums[mid]){
                    lo = mid + 1;
                } else{
                    hi = mid;
                }
            } else{
                if(target < nums[mid]){
                    hi=mid;
                } else{
                    lo= mid+1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5,6,1,2,3};

        System.out.println(search(nums, 2));
    }
}
