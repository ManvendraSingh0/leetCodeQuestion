public class StringCompressio443 {
    public static void main(String[] args) {
        // String str="";
        int ind=0;
        char [] ch ={'a','a','b','b','b','b'} ;
        for(int i=0;i<ch.length;i++)
        {
            int c=1;
            while(i+1<ch.length && ch[i]==(ch[i+1]))
            {
                c++;
                i++;
            }
            ch[ind++]=ch[i];
            if(c>1)
           for(char c1:Integer.toString(c).toCharArray())
           {
            ch[ind++]=c1;
           }
        }
        
       System.out.println(ind);
        //System.out.println(str+" "+str.length());
    }
    
}
