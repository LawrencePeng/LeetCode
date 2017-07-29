public class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int len = nums.length;
        int high = len - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        int lowIndex = low;
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int searchIndex = (mid + lowIndex) % len;
            if (nums[searchIndex] == target) {
                return searchIndex;
            } else if (nums[searchIndex] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
