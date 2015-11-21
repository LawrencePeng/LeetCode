public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isOk(root.left,root.right);
    }
    
    public boolean isOk(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        return left.val == right.val ? isOk(left.right,right.left) && isOk(left.left,right.right) : false;
    }
}
