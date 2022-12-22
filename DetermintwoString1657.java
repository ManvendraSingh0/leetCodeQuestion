import java.util.Arrays;

public class DetermintwoString1657 {
    public static void main(String[] args) {
        String word1="abc";
        String word2="bca";
       char[] s1=word1.toCharArray();
       char[] s2=word2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String s3=String.valueOf(s1);
         String s4=String.valueOf(s2);
         System.out.println(s3+"  "+s4);
    }
}
