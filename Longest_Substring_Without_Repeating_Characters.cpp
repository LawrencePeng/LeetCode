class Solution {
public:
    int lengthOfLongestSubstring(string s) {
    // for ASCII char sequence, use this as a hashmap
        vector<int> charIndex(256, -1);
        int longest = 0, m = 0;

        for (int i = 0; i < s.length(); i++) {
            m = max(charIndex[s[i]] + 1, m);    // automatically takes care of -1 case
            charIndex[s[i]] = i;
            longest = max(longest, i - m + 1);
        }

        return longest;
    }
};
