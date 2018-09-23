public class SpanOfArray {
    public int maxSpan(int[] nums){
        int result = 0, newResult = 0;

        for(int i = 0; i < nums.length; i++){
            int j = nums.length-1;

            while(nums[i] != nums[j]){
                if(j <= i)
                    break;
                j--;
            }

            newResult = j - i + 1;

            if(newResult > result)
                result = newResult;
        }

        return result;
    }
}
