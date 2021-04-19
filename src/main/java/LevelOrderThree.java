import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 * 实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 */
public class LevelOrderThree {

    public static void main(String[] args) {
        System.out.println(4%2);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;

        int flag = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            LinkedList<Integer> tempList = new LinkedList<>();

            //这个循环遍历条件需要注意一下
            for (int i = queue.size(); i > 0; i--) {
                TreeNode tempNode = queue.poll();

                //这个循环遍历条件需要注意一下
                if(flag%2 != 0){
                    tempList.addLast(tempNode.val);
                }else {
                    tempList.addFirst(tempNode.val);
                }
                if(tempNode.left != null) queue.offer(tempNode.left);
                if(tempNode.right != null) queue.offer(tempNode.right);

            }
            flag++;

            res.add(tempList);

        }
        return res;
    }
}
