public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!hm.containsKey(nums1[i])) {
                hm.put(nums1[i], 1);
            } else {
                hm.put(nums1[i], hm.get(nums1[i]) + 1);
            }
        }

        HashMap<Integer, Integer> retHm = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            if (hm.containsKey(nums2[i])) {
                if(!retHm.containsKey(nums2[i])) {
                    retHm.put(nums2[i], 1);
                } else {
                    if (hm.get(nums2[i]) > retHm.get(nums2[i])) {
                        retHm.put(nums2[i], retHm.get(nums2[i]) + 1);
                    }
                }
            }
        }

        int length = 0;
        for (Map.Entry<Integer, Integer> entry : retHm.entrySet()) {
            length += entry.getValue();
        }

        int[] retArr = new int[length];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : retHm.entrySet()) {
            int times = entry.getValue();
            while(times != 0) {
                retArr[index++] = entry.getKey();
                times--;
            }
        }

        return retArr;
    }
}
