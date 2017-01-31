public class Solution {
    public static int countSegments(String s) {
        return (int) Arrays
                .stream(s.split("\\s+"))
                .filter(e -> e.length() != 0)
                .count();
    }
}
