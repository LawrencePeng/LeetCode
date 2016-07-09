public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < nums1.length; i++) {
            treeSet.add(nums1[i]);
        }
        Set<Integer> retSet = new TreeSet<>();
        for (int i = 0; i < nums2.length; i++) {
            final int value = nums2[i];
            if (treeSet.contains(value)) {
                retSet.add(value);
            }
        }
        int[] retArr = new int[retSet.size()];
        int index = 0;
        for (Iterator<Integer> iter = retSet.iterator(); iter.hasNext();) {
            retArr[index++] = iter.next();
        }
        return retArr;
    }
}
