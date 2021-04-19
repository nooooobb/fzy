import java.util.Arrays;
import java.util.concurrent.*;

public class Exchange {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        exchange(nums);
        System.out.println(Arrays.toString(nums));
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(new Thread(){
            @Override
            public void run() {

            }
        });
    }

    public static int[] exchange(int[] nums) {
        if(nums.length == 0)return new int[0];

        int temp = nums[0];
        int i = 0;
        int j = nums.length-1;

        while (i<j){
            while(i<j && nums[j] % 2 ==0){
                j--;
            }
            if(i<j){
                nums[i] = nums[j];
                i++;
            }

            while (i<j && nums[i] % 2 == 1){
                    i++;
            }
            if(i<j){
                nums[j] = nums[i];
                j--;
            }

        }
        nums[i] = temp;
        return nums;

    }
}
