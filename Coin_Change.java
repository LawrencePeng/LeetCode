public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount + 1];
        for (int i = 1; i <= amount; i++)
            arr[i] = amount + 1;
        arr[0] = 0;

        for (int i = 1; i <= amount; i++)
            for (int c : coins)
                if (i - c >= 0)
                    arr[i] = Math.min(arr[i], arr[i - c] + 1);

        return arr[amount] > amount ? -1 : arr[amount];
    }
}
