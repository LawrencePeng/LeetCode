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
    private List<List<Integer>> lli = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        helper(root, 0);
        return lli;
    }

    private void helper(TreeNode node, int level) {
        if (node == null) return;

        List<Integer> li;

        try {
            li = lli.get(level);
        } catch (IndexOutOfBoundsException e) {
            li = null;
        }

        if (li == null) {
            li = new ArrayList<>();
            ArrayList alli = (ArrayList) lli;
            alli.add(li);
        }

        li.add(node.val);
        helper(node.left, level + 1);
        helper(node.right, level + 1);
    }
}
