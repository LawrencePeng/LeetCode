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

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int val = 0;
        if (root.left != null) {
            val += rob(root.left.left);
            val += rob(root.left.right);
        }
        if (root.right != null) {
            val += rob(root.right.left);
            val += rob(root.right.right);
        }

        return Integer.max(root.val + val, rob(root.left) + rob(root.right));
    }
}
