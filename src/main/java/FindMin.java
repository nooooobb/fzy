import java.util.Hashtable;

public class FindMin {
    public static void main(String[] args) {

    }

    public static int findMin(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < nums[0]) {
                count = i;
                break;
            }

        }
        return nums[count];
    }
}
