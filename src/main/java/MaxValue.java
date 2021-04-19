public class MaxValue {

    public static void main(String[] args) {
        int[][] a  = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(getMaxValue(a));
    }

    //这种方法不符合特殊情况
    public static int maxValue(int[][] grid) {
        int i = 0;
        int j = 0;
        int res = grid[0][0];

        while(i < grid[0].length-1 || j < grid.length-1){
            if(grid[i][j+1] > grid[i+1][j]){
                res += grid[i][j+1];
                j++;
            }else {
                res += grid[i+1][j];
                i++;
            }

            if( i == grid.length-1){
                while (j<grid[0].length-1){
                    res += grid[i][j+1];
                    j++;
                }
                break;
            }
            if( j == grid[0].length-1){
                while (i<grid.length-1){
                    res += grid[i+1][j];
                    i++;
                }
                break;
            }

        }
        return res;
    }

    public static int getMaxValue(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

//        int[][] dp = new int[m][n];
//        dp[0][0] = grid[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 && j == 0){
                    continue;
                }
                if(i == 0){
                    grid[i][j] += grid[i][j-1];
                }else if(j == 0){
                    grid[i][j] += grid[i-1][j];
                }else {
                    grid[i][j] += Math.max(grid[i][j-1],grid[i-1][j]);
                }
            }
        }
        return grid[m-1][n-1];
    }
}
