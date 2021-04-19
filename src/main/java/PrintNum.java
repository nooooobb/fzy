import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintNum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNum(2)));
    }


    public static int[] printNum(int n) {
        int[] res = new int[(int) Math.pow(10, n) - 1];
        System.out.println((int) Math.pow(10, 1));
        for (int i = 0; i < (int) Math.pow(10, n) - 1; i++) {
            res[i] = i + 1;
        }

        return res;
    }
}