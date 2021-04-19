import java.util.ArrayList;
import java.util.List;

public class HouXu {
    public List<Integer> houXu(TreeNode root){
        List<Integer> res = new ArrayList<>();
        hou(root,res);

        return res;
    }

    public void hou(TreeNode root,List<Integer> res){
        if(root == null) return;

        hou(root.left,res);
        hou(root.right,res);
        res.add(root.val);

    }
}
