package GeeksForGeeks;

public class DFS {
    private static boolean[][] visited;
    public static void dfs(int[][] arr){
        visited = new boolean[arr.length][arr[0].length];
        dfs(arr, visited, 0, 0);
    }

    private static void dfs(int[][] arr, boolean[][] visited, int i, int j) {
        if(i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || visited[i][j])
            return;

        System.out.println(arr[i][j]);
        visited[i][j] = true;
        dfs(arr, visited, i+1, j);
        dfs(arr, visited, i, j+1);
        dfs(arr, visited, i-1, j);
        dfs(arr, visited, i, j-1);
    }

    public static void main(String[] args) {
        //int[][] arr = {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //dfs(arr);

        int[][] arr = {{1,1,0,1,1},
                       {1,1,0,0,1},
                       {0,0,1,1,0},
                       {1,0,1,1,0}};
        System.out.println(numOfIslands(arr));
    }

    private static int numOfIslands(int[][] arr){
        if(arr.length == 0 || arr == null)
            return 0;

        int numIslands = 0;

        for(int r = 0; r < arr.length; r++)
            for(int c = 0; c < arr[0].length; c++){
                if(arr[r][c] == 1){
                    numIslands++;
                    dfsNumIslands(arr, r, c);
                }
            }


        return numIslands;
    }

    private static void dfsNumIslands(int[][] arr, int r, int c) {
        if(r < 0 || c < 0 || r >= arr.length || c >= arr[0].length || arr[r][c] == 0)
            return;

        arr[r][c] = 0;
        dfsNumIslands(arr, r+1, c);
        dfsNumIslands(arr, r, c+1);
        dfsNumIslands(arr, r-1, c);
        dfsNumIslands(arr, r, c-1);
    }
}
