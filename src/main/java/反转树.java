public class 反转树 {
    public static void main(String[] args) {

    }

    public static TreeNode  invert(TreeNode root){
        if(root == null) return null;
        TreeNode temp = root.left;

        root.left = invert(root.right);

        root.right = invert(temp);

        return root;
    }
}
