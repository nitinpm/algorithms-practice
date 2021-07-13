package Misc;

import java.util.HashSet;
import java.util.Map;

public class SumOfThree {

    public static int[] sumOfThree(int[] arr, int sum){
        int[] result = new int[3];
        HashSet<Integer> arrMap = new HashSet<>();

        for(int item: arr)
            arrMap.add(item);

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                int thirdElement = sum - arr[i] - arr[j];
                if(arrMap.contains(thirdElement)){
                    result[0] = arr[i];
                    result[1] = arr[j];
                    result[2] = thirdElement;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] input = {2,6,10,14,18,22,26,30,34,38,42,46,50,54,58};
        input = sumOfThree(input, 70);
        for(int item: input)
            System.out.print(item + "\t");
    }
}
