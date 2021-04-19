/**
 * 数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
 *
 * 请写一个函数，求任意第n位对应的数字。
 *
 * 示例 1：
 * 输入：n = 3
 * 输出：3
 *
 * 示例 2：
 * 输入：n = 11
 * 输出：0
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindNthDigit {
    public static void main(String[] args) {
        int n = 1213123;
        String s = Integer.toString(n);

//        findNthDigit();
    }

    public static int findNthDigit(int n) {
        if(n < 0)return 0;
        else if(n>=0 && n<=9){
            return n;
        }
        long m = n;
        char result = '0';
        //当前位置
        long temp = 0;
        //占的位数
        int base = 1;
        //多少数字
        long num = 9;

        while((temp+base*num) < m){
            temp = temp+base*num;
            base = base+1;
            num = num*10;
        }

        long a = (m-temp)/base;
        long b = (m-temp)%base;
        if(b!=0){
            long c = (long)(Math.pow(10,base-1)+a);
            result = String.valueOf(c).charAt((int)b-1);
        }else {
            long c = (long) (Math.pow(10,base-1)+a-1);
            result = String.valueOf(c).charAt((int)base-1);
        }

        return Integer.parseInt(String.valueOf(result));
    }
}
