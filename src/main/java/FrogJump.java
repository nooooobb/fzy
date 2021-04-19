import java.util.ArrayList;
import java.util.List;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：2
 * 示例 2：
 *
 * 输入：n = 7
 * 输出：21
 * 示例 3：
 *
 * 输入：n = 0
 * 输出：1
 *
 * 动态规划！！
 */
public class FrogJump {
    public static void main(String[] args) {
        System.out.println(numWays(5));
    }

    public static int numWays(int n) {
        int a = 1;
        int b = 1;
        int temp;
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(1);
//        if(n==0){
//
//            return 1;
//        }
        for(int i = 2;i <= n;i++){
            temp = (a+b)%1000000007;
            a = b;
            b = temp;
            result.add(temp);
        }

        return result.get(n);
    }
}
