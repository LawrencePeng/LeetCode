public class Solution {
    public int getSum(int a, int b) {
        int sum = 0, adv = 0;
        for (int i = 0; i < 32; i++) {
            int bitOfA = (a >> i) & 1;
            int bitOfB = (b >> i) & 1;
            int cacu = bitOfA ^ bitOfB ^ adv;
            sum |= cacu << i;
            adv = (bitOfA & bitOfB) | (adv & (bitOfA | bitOfB));
        }
        return sum;
    }
}
