package AE.arrays;

import java.util.Arrays;

class SortedSquared {

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int smallestIdx = 0, largestIdx = array.length - 1;
        int[] result = new int[array.length];
        int resultIdx = array.length - 1;
        int smallest, largest;

        while(smallestIdx <= largestIdx){
            smallest = array[smallestIdx];
            largest = array[largestIdx];

            if(Math.abs(smallest) < Math.abs(largest)){
                result[resultIdx--] = largest*largest;
                largestIdx--;
            } else{
                result[resultIdx--] = smallest*smallest;
                smallestIdx++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {-6,-4,1,5,8};
        System.out.println(Arrays.toString(sortedSquaredArray(input)));
    }
}
