import java.util.Arrays;

public class Test {
    @org.junit.Test
    public void twoSum() {
        System.out.println("11");
        int[] nums = {2,7,11,15};
        int target = 9;
        int size = nums.length;
        int[] a = new int[2];
        int sum;
        boolean flag = false;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                sum = nums[i]+nums[j];
                if(sum == target){
                    a[0] = i;
                    a[1] = j;
                    flag=true;
                    break;
                }
            }
            if(flag == true)
                break;
        }
    }
}
