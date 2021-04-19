import java.util.HashSet;
import java.util.Set;

/**
 *在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *  示例 1：
 *  输入：
 *  [2, 3, 1, 0, 2, 5, 3]
 *  输出：2 或 3
 *
 */
public class FindRepeatNum {
    public static void main(String[] args) {
        int[] a =new int[]{1,2,3,4,5,6,1,2};
//        System.out.println(findRepeatNumber(a));
        System.out.println(findRepeatNumb(a));
        int b = 2;
        int c = 3;
//        System.out.println(b|c);
    }

    //自己的做法
    public static int findRepeatNumber(int[] nums) {
        int result = 0;
        int i,j = 0;
        for(i = 0;i < nums.length-1;i++){
            for(j = i+1;j<nums.length;j++){
                if(nums[i]-nums[j] == 0){
                    result = nums[i];
                }
            }
        }
        return result;
    }

    public static int findRepeatNumb(int[] nums){
        Set<Integer> a = new HashSet<>();
        int result = 0;
        for (int num:nums) {
            if(!a.add(num)){
                result = num;
                break;
            }
        }
        return result;
    }


}
