public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        HashMap<Integer, Integer> m0 = new HashMap<>();
        HashMap<Integer, Integer> n0 = new HashMap<>();
        
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                if(matrix[i][j] == 0) {
                    if(!m0.containsKey(i))
                        m0.put(i,0);
                    if(!n0.containsKey(j))
                        n0.put(j,0);
                }
                
        Iterator<Map.Entry<Integer, Integer>> iterator = m0.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator.next();
            int mKey = next.getKey();
            for(int i = 0; i < n; i++)
                matrix[mKey][i] = 0;
        }
        
        Iterator<Map.Entry<Integer, Integer>> iterator2 = n0.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator2.next();
            int nKey = next.getKey();
            for(int i = 0; i < m; i++)
                matrix[i][nKey] = 0;
        }
    }
}
