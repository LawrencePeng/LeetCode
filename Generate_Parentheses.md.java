public class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> m=new ArrayList<>();
        generate(m, "", n, n);
        return m;
    }
    public void generate(ArrayList m, String s, int l, int r){
        if(l==0 && r==0){ 
            m.add(s);
            return;
        }
        if(l>0) generate(m, s+"(",  l-1,  r);
        if(r>l) generate(m, s+")",  l,  r-1);
    }


}
