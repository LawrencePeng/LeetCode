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
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        String left, right;
        if (t.right == null) {
            right = "";
            if (t.left == null) {
                left = "";
            } else {
                left = "(" + tree2str(t.left) + ")";
            }
        } else {
            right = "(" + tree2str(t.right) + ")";
            if (t.left == null) {
                left = "()";
            } else {
                left = "(" + tree2str(t.left) + ")";
            }
        }
        return t.val + left + right;
    }
}
