public class 最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode cur, TreeNode p, TreeNode q) {
        if(cur == null || cur == q || cur == p)return cur;
        TreeNode left = lowestCommonAncestor(cur.left,p,q);
        TreeNode right = lowestCommonAncestor(cur.right,p,q);
        //如果left为空，说明这两个节点在cur结点的右子树上，我们只需要返回右子树查找的结果即可
        if(left == null)return right;

        if(right == null)return left;
        //如果left和right都不为空，说明这两个节点一个在cur的左子树上一个在cur的右子树上，
        //我们只需要返回cur结点即可。
        return cur;
    }
}
