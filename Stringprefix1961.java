public class Stringprefix1961 {
    public static void main(String[] args) {
        String s="aaaaaa";
        String w[]={"a","a","a","a","a","a","a","a"};
        String ans="";
        int l=0;
        for(int i=0;i<w.length;i++)
        {
            if(s.contains(w[i]) && l<s.length())
            {
                ans=ans+w[i];   
                l=ans.length(); 
            }
            else
            break;
        }
        //System.out.println(ans);
        System.out.println(s.equals(ans));
    }
}
