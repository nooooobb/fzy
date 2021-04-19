import java.util.Arrays;

public class 两数之和 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,14,16};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    //超出时间限制
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
//        int mid = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]>target) break;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]>target)break;

                if(nums[i]+nums[j] == target){
                    result[0] = nums[i];
                    result[1] = nums[j];
                    break;
                }
            }
        }
        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;

        while(i<j){
            int s = nums[i]+nums[j];
            if(s<target){
                i = i+1;
            }else if(s>target){
                j = j-1;
            }else {
                return new int[]{nums[i],nums[j]};
            }
        }

        return new int[0];
    }
}
