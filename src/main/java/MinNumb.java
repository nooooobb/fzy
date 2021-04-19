/**
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *
 * 示例 1:
 *
 * 输入: [10,2]
 * 输出: "102"
 * 示例 2:
 *
 * 输入: [3,30,34,5,9]
 * 输出: "3033459"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinNumb {

    public static void main(String[] args) {
        int[] a = {3,30,34,5,9};
        System.out.println(minNumber(a));
    }

    public static String minNumber(int[] nums) {
        String[] mid = new String[nums.length];
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            mid[i] = String.valueOf(nums[i]);
        }
        quickSort(mid,0,nums.length-1);
        for (int i = 0; i < mid.length; i++) {
            temp.append(mid[i]);
        }


        return temp.toString();
    }

    static void quickSort(String[] n , int low , int high){
        if(low >= high)
            return;

        int i = low ;
        int j = high;
        String temp = n[low];

        while(i<j){
            while((n[j]+temp).compareTo(temp+n[j]) >= 0 && i < j) j--;
            if(i<j){
                n[i] = n[j];
                i++;
            }

            while((n[i] + temp).compareTo(temp + n[i]) <= 0 && i < j) i++;
            if(i<j){
                n[j] = n[i];
                j--;
            }

        }
        n[i] = temp;


        quickSort(n,low,i-1);
        quickSort(n,i+1,high);
    }
}
