import java.util.Arrays;

/**
 * 把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s的所有可能的值出现的概率。
 *
 * 你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: [0.16667,0.16667,0.16667,0.16667,0.16667,0.16667]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/nge-tou-zi-de-dian-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class DicesProbability {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(dicesProbability(n)));
    }

    public static double[] dicesProbability(int n) {
        int[][] dp = new int[n+1][6*n+1];

        for(int i = 1;i<=6;i++){
            dp[1][i] = 1;
        }
        for(int i = 2;i<=n;i++){
            for(int j = i;j<=6*n;j++){
                for(int k = 1;k<=6;k++){
                    if(j-k>0){
                        dp[i][j] += dp[i-1][j-k];
                    }else {
                        break;
                    }
                }
            }
        }
        double sum = Math.pow(6.0,n);
        double[] arr = new double[6*n-n+1];
        for(int i = n;i<=6*n;i++){
            arr[i-n] = dp[n][i]/sum;
        }
        return arr;
    }
}
