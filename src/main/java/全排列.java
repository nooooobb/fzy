import java.util.ArrayList;
import java.util.List;

public class 全排列 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        boolean[] used  = new boolean[nums.length];

        List<Integer> mid = new ArrayList<>();

        dfs(nums,res,mid,0,used);

        return res;
    }
    public static void dfs(int[] nums,List<List<Integer>> res,List<Integer> mid,int start,boolean[] used){

        if(start == nums.length){
            res.add(new ArrayList<>(mid));
        }

        for (int i = 0; i < nums.length; i++) {
            if(!used[i]){
                mid.add(nums[i]);
                used[i] = true;
                dfs(nums,res,mid,start+1,used);
                used[i] = false;
                mid.remove(mid.size()-1);

            }
        }

    }


}
