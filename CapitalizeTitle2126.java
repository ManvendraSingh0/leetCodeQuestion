public class CapitalizeTitle2126 {
    public static void main(String[] args) {
        String s="First leTTeR of EACH Word";
        String [] str=s.split(" ");
        for(int i=0;i<str.length;i++)
        {
            str[i]=str[i].toLowerCase();
            if(str.length>2)
            str[i]=str[i].substring(0,1).toUpperCase()+str[i].substring(1);
        }
        s = String.join(" ", str);
        System.out.println(s);
        

    }
}
