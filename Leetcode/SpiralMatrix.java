package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if(matrix.length == 0)
            return result;

        int row = matrix.length;
        int col = matrix[0].length;

        int i=0, j=0;
        int left=0, right=col, bot=row, top=0;

        int n = 0;

        while(n<row*col){

            for(;j<right;j++) {
                result.add(matrix[i][j]);n++;
            }
            right--;j--;i++;top++;

            for(;i<bot;i++) {
                result.add(matrix[i][j]);n++;
            }
            bot--;i--;j--;

            if(n == row*col)
                break;

            for(;j>=left; j--){
                result.add(matrix[i][j]);n++;
            }
            left++;j++;i--;

            if(n == row*col)
                break;

            for(;i>=top;i--){
                result.add(matrix[i][j]);n++;
            }
            i++;j++;
        }

        return result;
    }
}
