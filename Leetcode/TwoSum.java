import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        boolean found = false;

        for(int i = 0; i < length-1; i++){
            for (int j = i+1; j < length; j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    found = true;
                    break;
                }
            }
            if(found)
                break;
        }

        return result;
    }

    public int[] twoSumOptimum(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;

        HashMap<Integer, Integer> m = new HashMap<>();

        for(int i = 0; i < length; i++)
            m.put(nums[i], i);

        for (int j = 0; j < length; j++){
            if((m.get(target-nums[j])) != null){
                result[0] = j;
                result[1] = m.get(target-nums[j]);
                break;
            }

        }

        return result;
    }
}
