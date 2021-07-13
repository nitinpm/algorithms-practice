package AE.arrays;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int seqIndex = 0;

        for(int item : array){
            if(seqIndex == sequence.size())
                return true;

            if(sequence.get(seqIndex) == item && seqIndex < sequence.size())
                seqIndex++;
        }

        if(seqIndex == sequence.size())
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(1, 6, -1, 10)));
    }
}
