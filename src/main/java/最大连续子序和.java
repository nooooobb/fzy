public class 最大连续子序和 {
    public static void main(String[] args) {
        int[] n = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(n));
    }

    public static int maxSubArray(int[] n){
        int sum = 0;
        int res = n[0];
        int index = 0;
        for (int k:n) {
            if(sum>0){
                sum = sum+k;
            }else {
                sum = k;
            }
            res = Math.max(sum,res);
//            if(sum>res){
//                index = k;
//                res = sum;
//            }
        }
        return res;
    }
}
