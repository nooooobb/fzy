import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class z字形打印 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);


        root.right.right = new TreeNode(5);

    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)return res;
        boolean flag = true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> mid = new ArrayList<>();
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode poll = queue.poll();
                if(flag){
                    mid.add(poll.val);
                }else {
                    mid.add(0,poll.val);
                }
                if(poll.left !=null){
                    queue.add(poll.left);
                }
                if(poll.right !=null){
                    queue.add(poll.right);
                }
            }
            res.add(mid);
            flag = !flag;

        }
        return res;
    }


    public List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
        boolean flag = false;
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> mid = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                mid.add(node.val);
                if(flag){
                    if(node.left!=null)queue.offer(node.left);
                    if(node.right!=null)queue.offer(node.right);
                }else {
                    if(node.right!=null)queue.offer(node.right);
                    if(node.left!=null)queue.offer(node.left);
                }
            }
            flag = !flag;
            res.add(mid);

        }
        return res;
    }




























}
