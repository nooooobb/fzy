import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderTwo {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.offer(root);
        while (!list.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for (int i = list.size(); i > 0; i--) {
                TreeNode tempNode = list.poll();
                temp.add(tempNode.val);
                if(tempNode.left != null) list.offer(tempNode.left);
                if(tempNode.right != null) list.offer(tempNode.right);
            }
            res.add(temp);
        }

        return res;

    }
}
