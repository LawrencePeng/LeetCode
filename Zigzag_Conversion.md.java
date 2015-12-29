public class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1)
            return s;
        String result = "";
        int step = 2 * (numRows-1);
        for(int row=0; row<numRows; row++)
        {
            for(int j=row; j<s.length();j+=step)
             {
                result += s.substring(j, j + 1);
                 if(row > 0 && row < numRows-1) {
                    int slash = j + step -2*row;
                    if(slash < s.length())
                        result += s.substring(slash, slash + 1);  
                 }
            }
        }
        return result;    
    }
}
