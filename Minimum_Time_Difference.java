public class Solution {
    public int findMinDifference(List<String> timePoints) {
        int min = Integer.MAX_VALUE;
        List<Integer> times = new ArrayList<>();

        for(int i = 0; i < timePoints.size(); i++){
            int h = Integer.valueOf(timePoints.get(i).substring(0, 2));
            times.add(60 * h + Integer.valueOf(timePoints.get(i).substring(3, 5)));
        }

        Collections.sort(times, (a, b) -> Integer.compare(a, b));

        for (int i = 1; i < times.size(); i++) {
            min = Math.min(min, times.get(i) - times.get(i - 1));
        }

        int corner = times.get(0) + (1440 - times.get(times.size() - 1));
        return Math.min(corner, min);
    }
}
