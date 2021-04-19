import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] n){
        Arrays.sort(n);
        List<List<Integer>> res = new ArrayList<>();
        if(n.length < 3)return res;
        for (int k = 0; k < n.length - 2; k++) {
            if(n[k]>0)break;
            //这里k-1代表上一轮已经判断过 就直接跳过
            if(k>0 && n[k] == n[k-1]) continue;

            int i = k+1;
            int j = n.length-1;
            while (i<j){
                List<Integer> mid = new ArrayList<>();
                int sum = n[i] + n[j] + n[k];
                if(sum<0){
                    while (i<j && n[i] == n[++i]) ;
                }else if(sum>0){
                    while (i<j && n[j] == n[--j]);
                }else {
                    mid.add(n[k]);
                    mid.add(n[i]);
                    mid.add(n[j]);
                    res.add(mid);
                    while (i<j && n[i] == n[++i]) ;
                    while (i<j && n[j] == n[--j]) ;
                }
            }
        }
        return res;


    }
}
