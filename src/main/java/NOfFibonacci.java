import java.util.ArrayList;
import java.util.List;

/**
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 *  示例 1：
 *
 * 输入：n = 2
 * 输出：1
 *
 * 示例 2：
 * 输入：n = 5
 * 输出：5
 *
 * 简单动态规划
 */
public class NOfFibonacci {
    public static void main(String[] args) throws InterruptedException {
//        Object obj = new Object();
//        synchronized (Thread.currentThread()){
//            obj.wait();
//            obj.notify();
//        }

        System.out.println(fib(48));
    }

    public static int fib(int n) {

        int zero = 0;
        int one = 1;
        List<Integer> series = new ArrayList<>();
        series.add(zero);
        series.add(one);
        for(int i = 2;i<=n;i++){
            int mid = (series.get(i-2)+series.get(i-1))%1000000007;
            series.add(mid);
        }

        return series.get(n);
    }
}
