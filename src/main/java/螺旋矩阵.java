import java.util.ArrayList;
import java.util.List;

public class 螺旋矩阵 {
    public static void main(String[] args) {
        int[][] n = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(n));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        List<Integer> res = new ArrayList<>();
        boolean[][] visited = new boolean[rows][columns];

        int row = 0;
        int column = 0;
        int total = rows*columns;

        //如果要改成逆时针 就更改这个数组
        int[][] directions = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int directionIndex = 0;

        for (int i = 0; i < total; i++) {
            res.add(matrix[row][column]);
            visited[row][column] = true;

            int nextRow = row+directions[directionIndex][0];
            int nextColumn = column+directions[directionIndex][1];

            //directionIndex每更改一次就代表转换一次方向
            if(nextRow<0 || nextRow>=rows || nextColumn >=columns || nextColumn<0 || visited[nextRow][nextColumn]){
                directionIndex = (directionIndex+1)%4;
            }

            row += directions[directionIndex][0];
            column += directions[directionIndex][1];

        }
        return res;

    }
}
