public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int begin = 0;
        int end = numbers.length - 1;
        while (begin != end) {
            int sum = numbers[begin] + numbers[end];
            if (sum == target) {
                return new int[]{ begin + 1, end + 1 };
            } else if (sum > target) {
                end --;
            } else {
                begin ++;
            }
        }
        return null; // just make compiler happy.
    }
}
