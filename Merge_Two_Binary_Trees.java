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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        int t1Num = t1 != null ? t1.val : 0;
        int t2Num = t2 != null ? t2.val : 0;

        TreeNode neo = new TreeNode(t1Num + t2Num);
        neo.left = mergeTrees(t1 == null ? t1 : t1.left, t2 == null ? t2 : t2.left);
        neo.right = mergeTrees(t1 == null ? t1 : t1.right, t2 == null ? t2 : t2.right);
        return neo;
    }
}
