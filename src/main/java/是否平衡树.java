//判断是否平衡二叉树
public class 是否平衡树 {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;

        return Math.abs(depth(root.left)-depth(root.right)) <=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int depth(TreeNode node){
        if(node == null)return 0;

        return Math.max(depth(node.left),depth(node.right))+1;
    }
}
