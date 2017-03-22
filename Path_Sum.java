/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private int sm;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;

        if (isLeaf(root) && sm + root.val == sum) {
            return true;
        } else {
            sm += root.val;
            if (hasPathSum(root.left, sum) || hasPathSum(root.right, sum)) {
                return true;
            }
            sm -= root.val;
        }

        return false;
    }

    private boolean isLeaf(TreeNode node) {
        if (node == null)
            return false;

        return node.left == null && node.right == null;
    }
}
