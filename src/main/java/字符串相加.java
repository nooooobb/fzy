import java.lang.ref.PhantomReference;
import java.lang.ref.WeakReference;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 */
public class 字符串相加 {
    public static void main(String[] args) {

        int[] nums = new int[]{2,1,2,2};
        getNum(nums, 0, 0);
        System.out.println(max);

    }


    static Deque<Integer> left = new LinkedList<>();
    static Deque<Integer> right = new LinkedList<>();
    static int max;
    public static void getNum(int[] nums, int index, int score){
        if (index == nums.length) {
            max= Math.max(max, score);
            return;
        }
        if (!left.isEmpty() && nums[index] == left.element()) {
            getNum(nums, index + 1, score +1);
        } else {
            left.push(nums[index]);
            getNum(nums, index + 1, score);
            left.pop();

        }

        if (!right.isEmpty() && nums[index] == right.element()) {
            getNum(nums, index + 1, score+1);
        } else {
            right.push(nums[index]);
            getNum(nums, index + 1, score);
            right.pop();
        }



    }

    public static StringBuilder add(String a,String b){
        int i = a.length()-1;
        int j = b.length()-1;
        StringBuilder res = new StringBuilder();
        int carry = 0;
        while (i>=0 || j>=0){
            int n1 = i>=0 ? a.charAt(i)-'0' : 0;
            int n2 = j>=0 ? b.charAt(j)-'0' : 0;
            int temp = n1+n2+carry;
            carry = temp/10;
            res.append(temp%10);
            i--;
            j--;
        }
        if(carry == 1)res.append(1);
        return res;
    }
}
