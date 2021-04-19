package Sort;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {11,44,23,67,88,65,9,1,12};
        int[] temp = new int[arr.length];
        merge1123(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
//        LinkedHashMap
//        ConcurrentHashMap


    }

    public static void merge(int[] n,int low,int high,int mid,int[] temp){
        int i = 0;
        int j = low;
        int k = mid+1;
        //注意第一个循环
        while (j<=mid && k<=high){
            if(n[j] < n[k]){
                temp[i++] = n[j++];
            }else {
                temp[i++] = n[k++];
            }
        }
        while (j<=mid){
            temp[i++] = n[j++];
        }

        while (k<=high){
            temp[i++] = n[k++];
        }

        //这里这个判断注意一下
        for (int l = 0; l < i; l++) {

            n[low+l] = temp[l];
        }

    }

    public static void mergeSort(int[] n,int low,int high,int[] temp){
        if(low < high){
            int mid = (low+high)/2;
            mergeSort(n,low,mid,temp);
            mergeSort(n,mid+1,high,temp);
            merge(n,low,high,mid,temp);
        }
    }




    public static void merge1123(int[] n,int low,int high,int[] temp){
        if(low<high){
            int mid = (low+high)/2;
            merge1123(n,low,mid,temp);
            merge1123(n,mid+1,high,temp);
            merge2323(n,low,high,mid,temp);
        }

    }

    public static void merge2323(int[] n,int low,int high,int mid,int[] temp){
        int i = 0;
        int j = low;
        int k = mid+1;
        while (j<=mid && k <= high){
            if(n[j] <= n[k]) temp[i++] = n[j++];
            if(n[j] > n[k]) temp[i++] = n[k++];

        }
        while (j<=mid) temp[i++] = n[j++];
        while (k<=high) temp[i++] = n[k++];

        for (int l = 0; l < i; l++) {
            n[low+l] = temp[l];
        }

    }


























}
