public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return root;
        if((root.val - p.val) * (root.val - q.val) <= 0)
            return root;
        else if((root.val - p.val) < 0 && (root.val - q.val) < 0)
            return lowestCommonAncestor(root.right, p, q);
        else
            return lowestCommonAncestor(root.left, p, q);
    }
}
