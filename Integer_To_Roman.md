
class Solution {
public:
    string intToRoman(int num) {
        map<int, string, greater<int>> i2r({{1000, "M"}, {900, "CM"}, {500, "D"}, {400, "CD"}, {100, "C"}, {90, "XC"}, {50, "L"}, {40, "XL"}, {10, "X"}, {9, "IX"}, {5, "V"}, {4, "IV"}, {1, "I"}});
        string ans;
        while (num > 0) {
            for (const auto& e: i2r) {
                if (e.first <= num) {
                    num -= e.first;
                    ans += e.second;
                    break;
                }
            }
        }
        return ans;
    }
};
