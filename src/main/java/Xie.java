import java.util.concurrent.ThreadPoolExecutor;

public class Xie {
    public static void main(String[] args) {
        boolean[] s = {false,true,false,false,false,true,false,false,false,false};
        System.out.println(count(10, 7, 3, s));
        String s1 = "祝你考出好成绩";
        int a = 2;
        int b = 3;
        int c = 4;
        int e = 5;
        float k = 4.3f;
        System.out.println(--b*a+c*e--);

        System.out.println(s1.length());
    }


    public static int count(int n,int a,int b,boolean[] s){
        int count = 0 ;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if(!s[i]){
                count++;
            }else {
                count = 0;
            }
            if(count == 3){
                res = res+Math.min(a,b);
                count = 0;
            }
        }
        return res;
    }
}
