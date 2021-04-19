import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//线序遍历
public class 先序遍历 {
    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        preorder(root,res);


        return res;
    }

    public void preorder(TreeNode root,List<Integer> res){
        if(root == null)return;
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }
}
