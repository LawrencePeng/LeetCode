public class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int times=minutesToTest / minutesToDie + 1;
        if (buckets==1) return 0;
        int pigs = 0;
        long tt = times;
        while(tt < buckets){
            pigs ++;
            tt= tt * times;
        }
        return pigs + 1;
    }
}
