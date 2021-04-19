package Sort;

import java.util.*;

public class HeapSort1 {

    public static void main(String[] args) {

        int[] n = {6,5,2,7,3,9,10};
        heapSort2(n);
        System.out.println(Arrays.toString(n));
    }

    public static void heapSort(int[] n){
        for(int i = n.length -1;i>=1;i--){
            buildHeap(n,i);
            //i不等于0是因为 构造大顶堆时将最大值放在第一位
            swap(n,0,i);
        }
    }

    //这就是将最大值放在根的过程  每次排序构造一个大顶堆的树
    public static void buildHeap(int[] n ,int end){
        int len = end+1;
        //从第一个非叶子节点开始
        for(int i = len/2 -1;i>=0;i--){
            int l = 2*i + 1;
            int r = 2*i+2;
            //p是指针
            int p = l;
            //先判断是否有右子树
            if(r<=len-1 && n[l]<n[r]){
                p=r;
            }
            if(n[i] < n[p]){
                swap(n,i,p);
            }
        }
    }

    public static void swap(int[] n,int i, int j){
        n[i] ^= n[j];
        n[j] ^= n[i];
        n[i] ^= n[j];
    }



    public static void heapSort2(int[] n){
        for (int i = n.length-1; i >=1 ; i--) {
            buildHeap2(n,i);
            swap(n,0,i);
        }
    }
    public static void buildHeap2(int[] n,int end){
        int len = end+1;
        for (int i = len/2-1; i >= 0; i--) {
            int l = 2*i+1;
            int r = 2*i+2;
            int p = l;
            if(r<=len-1 && n[p]<n[r]){
                p=r;
            }
            if(n[i]<n[p]){
                swap(n,i,p);
            }
        }
    }
}