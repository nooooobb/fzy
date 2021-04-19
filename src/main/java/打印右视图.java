import java.util.*;

//打印右视图
public class 打印右视图 {
    public static void main(String[] args) {

    }
    public static List<Integer> printRight(TreeNode root){

        List<Integer> res = new ArrayList<>();
        if(root == null)return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            //此时未出队
            res.add(queue.peek().val);
            for (int i = 0; i < size; i++) {
                //此时出队
                TreeNode node = queue.poll();
                if(node.right != null)queue.add(node.right);
                if(node.left != null)queue.add(node.left);
            }
        }

        return res;
    }
    public static List<Integer> print22(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            //拿出队列中的tou元素 最右边
            TreeNode node = queue.peek();
            res.add(node.val);
            for (int i = 0; i < size; i++) {
                TreeNode mid = queue.poll();
                if(mid.right!=null)queue.add(mid.right);
                if(mid.left!=null)queue.add(mid.left);
            }
        }
        return res;

    }





































}
