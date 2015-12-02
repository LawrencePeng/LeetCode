public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(new ArrayList<Integer>());
        for(int i = 0; i < nums.length; i++) {
            List<List<Integer>> current = new ArrayList<List<Integer>>();
            for(List<Integer> l : list) {
                for(int j = 0; j < l.size() + 1; j++) {
                    l.add(j, nums[i]);
                    List<Integer> tmp = new ArrayList<Integer>(l);
                    current.add(tmp);
                    l.remove(j);
                }
            }
            list = new ArrayList<List<Integer>>(current);
        }
        return list;
    }
}
