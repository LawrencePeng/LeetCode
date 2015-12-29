public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String ans = "";
        int min = 3131;
        for(int i = 0; i < strs.length;i ++)
            if(min > strs[i].length())
                min = strs[i].length();
        boolean is = false;
        for(int i = 0; i < min; i ++) {
            String fir = strs[0].substring(i, i + 1);
            for(int j = 1; j < strs.length; j ++)
                if(!fir.equals(strs[j].substring(i, i + 1))) {
                    is = true;
                    break;
                }
            if(is)
                break;
            else ans += fir;
        }
        return ans;
    }
}
