public class 直径 {
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    public int depth(TreeNode node){
        if(node == null) return 0;

        int left = depth(node.left);
        int right = depth(node.right);

        max = Math.max(max,left+right+1);
        return Math.max(left,right)+1;
    }
}
