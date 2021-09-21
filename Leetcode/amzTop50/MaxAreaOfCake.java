package Leetcode.amzTop50;

import java.util.Arrays;

public class MaxAreaOfCake {
    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int hCutMaxHeight = 0, vCutMaxWidth = 0;
        int prevItem = 0;
        for(int item: horizontalCuts){
            hCutMaxHeight = Math.max(hCutMaxHeight, item - prevItem);
            prevItem = item;
        }
        hCutMaxHeight = Math.max(hCutMaxHeight, h - prevItem);

        prevItem = 0;

        for(int item: verticalCuts){
            vCutMaxWidth = Math.max(vCutMaxWidth, item - prevItem);
            prevItem = item;
        }

        vCutMaxWidth = Math.max(vCutMaxWidth, w - prevItem);

        return hCutMaxHeight*vCutMaxWidth;
    }

    public static void main(String[] args) {
        int[] hCuts = {3};
        int[] vCuts = {3};
        System.out.println(maxArea(5,4, hCuts, vCuts));
    }
}
