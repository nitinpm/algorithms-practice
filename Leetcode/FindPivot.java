public class FindPivot {
    public int pivotIndex(int[] nums) {

        if(nums.length > 0) {
            int leftSum = 0;
            int rightSum = 0;
            for (int item : nums) {
                rightSum += item;
            }

            rightSum -= nums[0];
            if(rightSum == leftSum)
                return 0;

            for(int i = 1; i <= nums.length - 1; i++){
                leftSum += nums[i-1];
                rightSum -= nums[i];

                if(leftSum == rightSum)
                    return i;
            }

            return -1;
        }
        else
            return -1;
    }
}
