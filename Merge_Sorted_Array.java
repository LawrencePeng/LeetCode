public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m + n];
        int mp = 0;
        int np = 0;
        int count = 0;
        while(mp != m || np != n)
            if(mp != m && np != n)
                if(nums1[mp] <= nums2[np])
                    ans[count++] = nums1[mp++]; 
                else
                    ans[count++] = nums2[np++];
            else if(mp == m) ans[count++] = nums2[np++];
            else ans[count++] = nums1[mp++];
        for(int i = 0; i < count;i ++)
            nums1[i] = ans[i];
    }
}
