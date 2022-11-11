public class leetcodelastSTring
{
    public static void main(String[] args) {
        String s="abab";
        System.out.println(generate(s));
    }
    public static String generate(String word ) {
        String mx="";
        for(int i=0;i<word.length();i++)
        {
           if( word.substring(i).compareTo(mx)>0)
               {
                mx=word.substring(i);
               }
        }
        return mx;
    }
}