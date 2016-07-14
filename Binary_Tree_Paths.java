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
    List<String> lst = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        helper(root, "");
        return lst;
    }

    public void helper(TreeNode node, String s) {
        if (node == null) return;

        if (isLeaf(node)) {
            lst.add(s + node.val);
        } else {
            helper(node.left, s + node.val + "->");
            helper(node.right, s + node.val + "->");
        }
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
