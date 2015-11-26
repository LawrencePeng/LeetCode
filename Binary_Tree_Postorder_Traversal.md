public class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        abc(root);
        return ans;
    }
    void abc(TreeNode root){
        if(root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            ans.add(root.val);
        }
    }
}
