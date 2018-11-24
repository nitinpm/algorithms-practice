package Leetcode;

public class DiagonalTraverse {

    public void printArray(int[] arr){
        for (int i: arr) {
            System.out.print(i + "\t");
        }
    }
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0)
            return new int[0];

        int[] result = new int[matrix.length*matrix[0].length];
        int row = matrix.length;
        int col = matrix[0].length;

        int i=0,j=0;
        boolean goingUp = true;


        for(int k=0;k<row*col;){

            if(goingUp) {
                for (; i >= 0 && j < col; j++, i--) {
                    result[k] = matrix[i][j];
                    k++;
                }

                if(i<0 && j<=col-1)
                    i=0;

                if(j == col) {
                    i += 2;
                    j--;
                }
            }

            else{
                for (; j >= 0 && i < row; i++, j--) {
                    result[k] = matrix[i][j];
                    k++;
                }

                if(j<0 && i<=row-1)
                    j=0;

                if(i == row) {
                    j += 2;
                    i--;
                }
            }

            goingUp = !goingUp;
        }




        return result;
    }
}
