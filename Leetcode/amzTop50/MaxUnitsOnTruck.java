package Leetcode.amzTop50;

import java.util.Arrays;
import java.util.Collections;

public class MaxUnitsOnTruck {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int unitCount = 0;
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);

        for(int i=0; i < boxTypes.length; i++){
            if(truckSize == 0)
                break;

            if(boxTypes[i][0] <= truckSize){
                truckSize -= boxTypes[i][0];
                unitCount += boxTypes[i][0] * boxTypes[i][1];
            } else{
                unitCount += truckSize * boxTypes[i][1];
                truckSize = 0;
            }
        }

        return unitCount;
    }

    public static void main(String[] args) {
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        System.out.println(maximumUnits(boxTypes, 10));
    }
}
