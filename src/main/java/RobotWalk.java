/**
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
 * 它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。
 * 请问该机器人能够到达多少个格子？
 *
 *
 * 示例 1：
 * 输入：m = 2, n = 3, k = 1
 * 输出：3
 *
 * 示例 2：
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RobotWalk {
    private static int m;
    private static int n;
    private static int k;
    static boolean[][] visited;
    public static void main(String[] args) {

        System.out.println(movingCount(38, 15, 9));

    }

    public static int movingCount(int m, int n, int k) {
        int count = 1;
        if(k == 0){
            return 1;
        }
        boolean[][] visit = new boolean[m][n];
        visit[0][0] = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if((i==0&&j==0) || getSum(i)+getSum(j)>k){
                    continue;
                }

                if(i-1>=0){
                    visit[i][j] |= visit[i-1][j];
                }
                if(j-1>=0){
                    visit[i][j] |= visit[i][j-1];
                }
                count += visit[i][j] ? 1 : 0;

            }
        }

        return count;
    }

    public static int getSum(int x){
        int result = 0;
        while(x != 0 ){
            result += x%10;
            x = x/10;
        }
        return result;
    }


    /**
     * 使用回溯算法 递归
     * https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/solution/mian-shi-ti-13-ji-qi-ren-de-yun-dong-fan-wei-dfs-b/
     */
    public int movingCount2(int n, int m, int k){
        this.m = m; this.n = n; this.k = k;
        this.visited = new boolean[m][n];
        return dfs(0,0,0,0);
    }

    public static int dfs(int i,int j,int si,int sj){
        if(i >= m || j>= n || si+sj>k || visited[i][j])
            return 0;
        visited[i][j] = true;
        return 1+(dfs(i+1,j,(i+1)%10 != 0 ? si+1 : si-8,sj)+dfs(i,j+1,si,(j+1)%10 != 0 ?sj+1:sj-8));
    }

}
