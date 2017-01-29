public class Solution {
    public int[] constructRectangle(int area) {
        int l = (int) Math.sqrt(area);
        while (l != 1) {
            if (area % l == 0) {
                return new int[] {Math.max(l, area / l), Math.min(l, area / 2)};
            }
            l--;
        }
        return new int[] {area, 1};
    }
}
