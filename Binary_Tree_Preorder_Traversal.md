public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root != null) {
            ans.add(root.val);
            ans.addAll(preorderTraversal(root.left));
            ans.addAll(preorderTraversal(root.right));
        }
        return ans;
    }
}
