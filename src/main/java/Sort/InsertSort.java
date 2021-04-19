package Sort;

import lombok.Synchronized;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[] {3,5,7,8,9,3,4,52,1,3};
        quick123(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    public static void insetSort(int[] n){
        //从i=1 开始，因为单独一个元素arr[0]是有序的
        for (int i = 1; i < n.length; i++) {
            int temp = n[i];
            int t = i-1;
            //不断往前寻找，直到找到比temp小的值或者t小于0为止  ——————这里的 t >= 0 要写在前面 不然会数组越界---————
            while (t >= 0 && n[t] > temp){
                n[t+1] = n[t];
                t--;
            }
            n[t+1] = temp;
        }
    }

    public static void quick(int[] n,int low ,int high){
        //边界条件记得加
        if(low >= high)return;
        int i = low;
        int j = high;
        int temp = n[low];

        while (i<j){
            while (n[j] > temp && i<j){
                j--;
            }
            if(i<j){
                n[i] = n[j];
                i++;
            }

            while (n[i] < temp && i<j){
                i++;
            }
            if(i<j){
                n[j] = n[i];
                j--;
            }
        }
        //这个记得写
        n[i] = temp;
        quick(n,low,i-1);
        quick(n,i+1,high);
    }

    public static void bubbleSort(int[] n){
        if(n.length == 0)return;

        for (int i = 0; i < n.length-1; i++) {
            for (int j = 0; j < n.length-1-i; j++) {
                if(n[j] > n[j+1]){
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
    }

    //每次遍历选最小的放
    public static void choose(int[] n){
        for (int i = 0; i < n.length; i++) {
            //这是找最小数的位置
            int index = i;
            for (int j = i+1; j < n.length; j++) {
                //这里注意
                if(n[index]>n[j]){
                    index = j;
                }
            }
            if(i != index){
                int temp = n[i];
                n[i] = n[index];
                n[index] = temp;
            }
        }
    }


    public static void insert222(int[] n){
        for (int i = 1; i < n.length; i++) {
            int index = i-1;
            int temp = n[i];
            while(index>=0 && n[index]>temp){
                n[index+1] = n[index];
                index--;
            }
           n[index+1] = temp;
        }
    }

    public static void choose123(int[] n){
        for (int i = 0; i < n.length; i++) {
            int index = i;
            for (int j = i+1; j < n.length; j++) {
                if(n[index]>n[j]){
                    index = j;
                }
            }
            if(i!=index){
                int temp = n[index];
                n[index] = n[i];
                n[i] = temp;
            }
        }
    }

    public static void bubble123(int[] n){
        for (int i = 0; i < n.length-1; i++) {
            for (int j = 0; j < n.length-1-i; j++) {
                if(n[j+1]<n[j]){
                    n[j+1] ^= n[j];
                    n[j] ^= n[j+1];
                    n[j+1] ^= n[j];
                }
            }
        }
    }

    public static void quick123(int[] n,int low,int high){
        if(low>=high)return;
        int i = low;
        int j = high;
        int temp = n[low];
        while(i<j){
            while(n[j]>temp && i<j){
                j--;
            }
            if(i<j){
                n[i] = n[j];
                i++;
            }

            while(n[i]<temp && i<j){
                i++;
            }
            if(i<j){
                n[j] = n[i];
                j--;
            }
        }
        n[i] = temp;

        quick123(n,low,i-1);
        quick123(n,i+1,high);


    }




}


