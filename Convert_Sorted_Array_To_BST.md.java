public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        int mid = len / 2;
        
        if(len == 0)
            return null;
            
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums,mid + 1,len));
        
        return root;
    }
}

