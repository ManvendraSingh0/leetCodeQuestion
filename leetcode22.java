import java.util.*;
public class leetcode22 {
    public static void main(String[] args) {
        int n=2;
        List<String> ans= new ArrayList<>();
        vaildpar(n,ans,0,0,"");
        for(int i = ans.size()-1;i>=0;i--)
        {
            System.out.println(ans.get(i));
        }
    }
    public static void  vaildpar(int n, List<String> ans,int o,int c,String s) {
        if(s.length()==2*n)
            {
                ans.add(s);
                return;
            }
        if(o<n)
        {
            vaildpar(n, ans, o+1, c, s+"(");
        }
        if(c<o)
        {
            vaildpar(n, ans, o, c+1, s+")");
        }
    }
}
