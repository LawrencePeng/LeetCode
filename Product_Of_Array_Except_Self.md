I found the way with division is even more difficult,So i write this version.

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int all = 1;
        for(int i = 0;i < len;i++)
            all *= nums[i];
        if(all == 0) {
            int count = 0;
            for(int i = 0;i < len;i++)
                if(nums[i] == 0)
                    count++;
            if(count >= 2) 
                for(int i = 0;i < len;i++)
                    ans[i] = 0;
            else {
                int pos = 0;
                for(int i = 0;i < len; i++)
                    if(nums[i] == 0)
                        pos = i;
                int tmp = 1;
                for(int i = 0;i < len;i++)
                    ans[i] = 0;
                for(int i = 0;i < len;i++)
                    if(i != pos)
                        tmp *= nums[i];
                ans[pos] = tmp;
                }
        }
        else
            for(int i = 0;i < len;i++)
                ans[i] = all / nums[i];
        return ans;
    }
}
