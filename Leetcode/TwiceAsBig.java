public class TwiceAsBig {
    public int dominantIndex(int[] nums) {
       int max = 0,maxIndex = 0;
        int secondMax = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            }

            else if(nums[i] > secondMax && nums[i] != max){
                secondMax = nums[i];
            }
        }

        if(max >= secondMax*2)
            return maxIndex;

        return -1;
    }
}
