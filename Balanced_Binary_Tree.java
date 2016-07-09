public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        if(abs(depth(root.left) - depth(root.right)) > 1 )
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    int abs(int a){ return a >=0 ? a : -a; }
    int depth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(depth(root.left),depth(root.right)) + 1;
    }
}
