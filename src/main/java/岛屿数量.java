public class 岛屿数量 {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int res = 0;
        if (grid == null || grid.length == 0) {
            return 0;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(grid[i][j] == '1'){
                    res++;
                    dfs(grid,i,j);
                }
            }
        }


        return res;
    }

    public void dfs(char[][] grid,int i,int j){
        int row = grid.length;
        int column = grid[0].length;

        if(i<0 || i>=row || j<0 || j>=column || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);

    }

}
