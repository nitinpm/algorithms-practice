package Leetcode;

import java.util.Arrays;

public class PlusOne {
    public void printArray(int[] arr){
        for (int i: arr) {
            System.out.print(i + "\t");
        }
    }

    public int[] plusOne(int[] digits) {
        boolean allNine = true;
        int[] result;
        for (int i: digits)
            if(i != 9) {
                allNine = false;
                break;
            }

        if(allNine){
            result = new int[digits.length+1];
            result[0]=1;
        }
        else{
            //result = new int[digits.length];
            result = Arrays.copyOf(digits, digits.length);
            for (int i=result.length-1; i>=0; i--){

                if(result[i] != 9){
                    result[i] += 1;
                    break;
                }
                else
                    result[i]=0;
            }
        }


        return result;
    }
}
