import java.util.*;
public class leetcode1323 {
    public static void main(String[] args) {
        int  m =9999;
        String s= String.valueOf(m);
        char c[]=s.toCharArray();
        String s1="";
        for(int i =0;i<c.length;i++)
        {
            if(c[i]=='6')
            {
                c[i]='9';
                    break;
            }
        }
        String s2=String.valueOf(c);
        int n=Integer.valueOf(s2);
    }
}
