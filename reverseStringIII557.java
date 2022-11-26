public class reverseStringIII557 {
    public static void main(String[] args) {
        String s= "Let's take LeetCode contest";
        String [] str=s.split(" ");
        s="";
        for(int i=0;i<str.length;i++)
        {
            StringBuilder s1=new StringBuilder(str[i]);
            s1.reverse();
            s=s+" "+s1.toString();
        }
        System.out.println(s.trim());
    }
}
