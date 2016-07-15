public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ret = 0;

        for (int i = 0; i < 16; i++) {
            int nHigh = (n >> (31 - i)) & 1;
            int nLow = (n >> i) & 1;
            int tmp = nHigh ^ nLow;
            ret |=  (tmp ^ nHigh) << (31 - i);
            ret |= (tmp ^ nLow) << i;
        }

        return ret;
    }
}
