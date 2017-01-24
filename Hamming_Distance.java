public class Solution {
    public int hammingDistance(int x, int y) {
        int sum = 0;
        for (int i = 0; i < 31; i++) {
            if (((1 << i) & x) != ((1 << i) & y)) {
                sum++;
            }
        }
        return sum;
    }
}
