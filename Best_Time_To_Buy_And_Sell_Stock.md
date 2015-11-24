public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int sum = 0;
        int max = 0;
        for(int i = 0;i < len - 1;i++) {
            sum += prices[i + 1] - prices[i];
            if(sum < 0)
                sum = 0;
            if(max < sum)
                max = sum;
        }
        return max;
    }
}
