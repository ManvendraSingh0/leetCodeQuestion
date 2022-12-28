public class checkprefix1455 {
    public static void main(String[] args) {
        String sentence="i love eating burger";
        String sw="burg";
        String s[]=sentence.split(" ");
        for(int i=0;i<s.length;i++)
        {
            if(s[i].startsWith(sw))
            {
               System.out.println(i+1);
               return;
            }
        }
       System.out.println(-1);
    }
}
