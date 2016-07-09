public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        k = len - k;
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
        reverse(nums, 0, len - 1);
    }
    public static void reverse(int[] arr, int left, int right){
        if(arr == null || arr.length == 1) 
            return;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
    }

}
