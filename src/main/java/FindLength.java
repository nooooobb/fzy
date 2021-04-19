public class FindLength {

    public static void main(String[] args) {

    }
    public int findLength(int[] A, int[] B) {
        int a = A.length;
        int b = B.length;
        int[][] dp = new int[a+1][b+1];
        int res = 0;

        for (int i = a-1; i >=0 ; i--) {
            for (int j = b-1; j >=0; j--) {
                if(A[i] != B[j]){
                    dp[i][j] = 0;
                }else {
                    dp[i][j] = dp[i+1][j+1]+1;
                }
                res = Math.max(res,dp[i][j]);
            }
        }
        return res;
    }
}
