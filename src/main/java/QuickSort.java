import java.util.Arrays;
//快排
public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[]{1,6,8,7,3,5,16,4,8,36,13,44};
        quickSort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


    //快排的本质是递归  所以首先就要有边界条件
    public static void quickSort(int[] n,int low,int high){
        //边界条件 很重要 没有的话直接栈溢出
        if(low >= high)
            return;

        int i = low;
        int j = high;
        int temp = n[low];


        while (i < j){
            while( i < j && n[j] > temp)
                j--;
            if(i<j){
                n[i] = n[j];
                i++;
            }

            while(i < j && n[i] < temp)
                i++;

            if(i<j){
                n[j] = n[i];
                j--;
            }
        }


        n[i] = temp;

        quickSort(n,low,i-1);
        quickSort(n,i+1,high);


    }
}
