class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        std::nth_element(nums.begin(), nums.end() - k, nums.end());
        return nums[nums.size() - k];
    }
};
