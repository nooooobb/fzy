

public class CutRope2 {
    public int cutRope2(int n){
        if(n <= 3){
            return n-1;
        }

        long res = 1l;

        /**
            据 数学证明：
            当 n >= 3时，因数 拆分成 3 的计算结果 较大
            当 n < 3时，因数越大，计算结果越大
        */
        while(n>4){
            res = 3*res%1000000007;
            n = n-3;
        }

         /**
            将 最后一个 因数 计算在内
        */
        res = res*n%1000000007;

        return (int)res;

    }
    

}
