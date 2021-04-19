import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindSingleNumber2 {

    public static void main(String[] args) {
        int[] a = new int[]{3,3,3,4};
        System.out.println(singleNumber(a));

    }

    public static int singleNumber(int[] nums) {
        Set<Integer> mid = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            res.add(nums[i]);
            if(!mid.add(nums[i])){
                res.remove(nums[i]);
            }
        }

        Iterator<Integer> iterator = res.iterator();
        result = iterator.next();

        return result;

    }
}
