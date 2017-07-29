class Solution {
public:
    void subsetsWithDup(vector<int>& nums, vector<int> res, vector<vector<int>>& ans, int start) {
        if (start == nums.size()) {
            ans.push_back(res);
            return;
        }
        subsetsWithDup(nums,res,ans,start+1);
        while (start + 1 < nums.size() && nums[start] == nums[start+1]) {
            res.push_back(nums[start]);
            ++start;
        }
        res.push_back(nums[start]);
        subsetsWithDup(nums,res,ans,start+1);
    }

    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<int> res;
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        subsetsWithDup(nums,res,ans,0);
        return ans;
    }
};
