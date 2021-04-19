import java.util.HashSet;
import java.util.Vector;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 *
 * 参考以下这颗二叉搜索树：
 *
 *      5
 *     / \
 *    2   6
 *   / \
 *  1   3
 * 示例 1：
 *
 * 输入: [1,6,3,2,5]
 * 输出: false
 * 示例 2：
 *
 * 输入: [1,3,2,6,5]
 * 输出: true
 *
 */
//有快排的思想
public class 是否后续遍历 {
    public boolean verifyPostorder(int[] postorder) {

        return recur(postorder,0,postorder.length-1);
    }

    public boolean recur(int[] n,int low ,int high){
        int mid = low;
        //如果left==right，就一个节点不需要判断了，如果left>right说明没有节点，
        //也不用再看了,否则就要继续往下判断
        if(low >= high)return true;

        //因为数组中最后一个值postorder[right]是根节点，这里从左往右找出第一个比
        //根节点大的值，他后面的都是根节点的右子节点（包含当前值，不包含最后一个值，
        //因为最后一个是根节点），他前面的都是根节点的左子节点
        while (n[mid]<n[high]){
            mid++;
        }
        int temp = mid;

        //因为postorder[mid]前面的值都是比根节点root小的，
        //我们还需要确定postorder[mid]后面的值都要比根节点root大，
        //如果后面有比根节点小的直接返回false
        while (temp<high) {
            if (n[temp++] < n[high])
                return false;
        }
        return recur(n,low,mid-1)&&recur(n,mid,high-1);


    }

}
