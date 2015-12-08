public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        if(n == 0 || k > n)
            return new ArrayList<List<Integer>>();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> item = new ArrayList<Integer>();
        dfs(n, k, 1, item, list);
        return list;
    }
    void dfs(int n, int k, int start, List<Integer> item, List<List<Integer>> res) {
        if(item.size() == k) {
            res.add(new ArrayList(item));
            return;
        }
        for(int i = start; i <= n; i++) {
            item.add(i);
            dfs(n, k, i + 1, item, res);
            item.remove(item.size() - 1);
        }
    }
}
