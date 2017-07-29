public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] levels1 = version1.split("\\.");
        String[] levels2 = version2.split("\\.");

        int length = Math.max(levels1.length, levels2.length);
        for (int i=0; i<length; i++) {
            Integer v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
            Integer v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
            int compare = v1.compareTo(v2);
            if (compare != 0) {
                return compare;
            }
        }

        return 0;
    }

    private List<Integer> vtoList(String version) {
        if (!version.contains(".")) {
            int n = Integer.valueOf(version);
            List<Integer> lst = new ArrayList<>();
            lst.add(n);
            return lst;
        }

        String[] parts = version.split(".");

        List<Integer> lst = new ArrayList<>();
        for (String part : parts) {
            lst.add(Integer.valueOf(part));
        }

        return lst;
    }
}
