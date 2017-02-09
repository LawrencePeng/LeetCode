public class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        final int len = nums.length;
        List<List<Integer>> ret = new LinkedList<>();
        final int all = 1 << len;
        for (int i = 0; i < all; i++) {
            List<Integer> ele = new LinkedList<>();
            for (int j = 0; j < len; j++) {
                if ((i & (1 << j)) != 0) {
                    ele.add(nums[j]);
                }
            }
            ret.add(ele);
        }
        return ret;
    }
}
