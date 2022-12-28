public class countPrefixes2255 {
    public static void main(String[] args) {
        String w[]={"a","a"};
        String s="aa";
        String ans="";
        int l=0;
        for(int i=0;i<w.length;i++)
        {
             if(s.startsWith(w[i]))
            {
                
                l++; 
            }
        }
        System.out.println(l);
       // return s.equals(ans); 
    }
}
