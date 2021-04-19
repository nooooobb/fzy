/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *  示例:
 *
 * 现有矩阵 matrix 如下：
 *
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 *
 * 给定 target = 20，返回 false。
 *
 */
public class SearchOfTwoArray {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{-1, 3}};
//        System.out.println(matrix.length);
//        System.out.println(matrix[0].length);

//        System.out.println(matrix[3][0]);
        findNumberIn2DArray2(matrix,3);

    }
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//        int[] mid = new int[];
        if(matrix.length == 0){
            return false;
        }
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i = 0;i<row;i++){
            for (int j = 0;j<column;j++){
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean findNumberIn2DArray2(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int row = matrix.length;
        int column = matrix[0].length;
        int mid = 0;
        int i = 0;
        int j = column-1;

        while(i < row && j >= 0){
            mid = matrix[i][j];
            if(target > mid){
                i = i+1;
            }else if(target < mid){
                j = j-1;
            }else {
                return true;
            }
        }
        if(target == matrix[row-1][0]){
            return true;
        }

        return false;
    }
}
