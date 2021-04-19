//合并两个有序数组，还可以用双指针
public class MergeArray {
    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m;
        for (int i = 0; i < n; i++) {
            nums1[k++] = nums2[i];
        }


    }

    public static void sort(int[] n,int low,int high){
        if(low>=high)return;

        int temp = n[low];
        int i = low;
        int j = high;
        while (i < j){
            while (n[j] > temp && i<j) j--;
            if(i<j){
                n[i] = n[j];
                i++;
            }

            while (n[i]<temp && i<j)i++;
            if(i<j){
                n[j] = n[i];
                j--;
            }

        }
        n[i] = temp;
        sort(n,low,i-1);
        sort(n,i+1,high);

    }
}
