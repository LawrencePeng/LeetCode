public class Solution {
    public static List<Integer> grayCode(int n) {
     List<Integer> result = new ArrayList<Integer>();
     if (n == 0) {
         result.add(0);
     } else {
         List<Integer> temp = grayCode(n-1);
         for (Integer i: temp) {
             result.add(i);
         }
         for (int i = temp.size() - 1; i >= 0; i--) {
             result.add(temp.get(i) + (1 << (n - 1)));
         }
     }
     return result;
}
}
