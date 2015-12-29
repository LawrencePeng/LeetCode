public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        int bitCount = 0;
        for(int i = 0; i < 32; i++){
            if((n & 1) == 1)
                bitCount ++;
            n >>>=1;
        }
        return bitCount == 1;
    }
}
