public class Solution {
    public int change(int amount, int[] coins) {
        int[] arr = new int[amount + 1];
        arr[0] = 1;
        for (int c : coins)
            for (int i = 1; i <= amount; i++)
                if (i >= c)
                    arr[i] += arr[i - c];
        return arr[amount];
    }
}
