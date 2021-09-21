package Leetcode.blind75.arrays;

public class ProductExceptSelf {

        public static int[] productExceptSelf(int[] nums) {

            int[] L = new int[nums.length];
            int[] R = new int[nums.length];

            int[] result = new int[nums.length];
            L[0] = 1;
            R[nums.length-1] = 1;

            for(int i=1; i < nums.length; i++){
                L[i] = L[i-1] * nums[i-1];
            }

            for(int i=nums.length - 2; i >= 0 ; i--){
                R[i] = R[i+1] * nums[i+1];
            }

            for(int i = 0; i < nums.length; i++){
                result[i] = L[i] * R[i];
            }

            return result;

        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        nums = productExceptSelf(nums);

        for(int n: nums){
            System.out.print(n + "\t");
        }
    }
}
