package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class AmazonSolution {

    private int pathLength;

    int removeObstacle(int numRows, int numColumns, List<List<Integer>> lot){

        int n = numRows;
        int m = numColumns;
        pathLength = 0;

        List<List<Integer>> visited = new ArrayList<List<Integer>>(lot.size());

        System.out.println(findPathHelper(lot, visited, 0, 0, n, m));

        return 0;
    }

    private boolean findPathHelper(List<List<Integer>> lot, List<List<Integer>> visited,  int i, int j, int numRows, int numColumns){

        //visited.get(i).add(j) = 0;

        if(checkIJIfOutside(i,j, numRows, numColumns)) {
            if (lot.get(i).get(j) == 0)
                return false;

            if (lot.get(i).get(j) == 9)
                return true;    //found the obstacle.

            if (findPathHelper(lot, visited, i + 1, j, numRows, numColumns) ||
                    findPathHelper(lot, visited, i - 1, j, numRows, numColumns) ||
                    findPathHelper(lot, visited, i, j + 1, numRows, numColumns) ||
                    findPathHelper(lot, visited, i, j - 1, numRows, numColumns)) {
                return true;
            }
        }

        return false;
    }

    private boolean checkIJIfOutside(int i, int j, int numRows, int numColumns){

        if((i<0 || i >= numRows || j<0 || j > numColumns))
            return false;

        return true;
    }


}
