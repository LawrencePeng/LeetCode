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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return 1;

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if (leftDepth == 0)
            return rightDepth + 1;

        if (rightDepth == 0)
            return leftDepth + 1;

        return leftDepth > rightDepth ? rightDepth + 1 : leftDepth + 1;
    }

    public boolean isLeaf(TreeNode node) {
        return node != null
                    && node.left == null
                    && node.right == null;
    }
}
