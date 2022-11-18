public class PermutationInString567 {
    public static void main(String[] args) {
        String s2="eidbaooo";
        String s1="ab";
        int count[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            count[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++)
        {
            count[s2.charAt(i)-'a']--;
            if(i-s1.length()>=0)
            {
                count[s2.charAt(i-s1.length())-'a']++;
            }
            if(chechCount(count))
            {
                 System.out.println(true);
                 return;
            }
        }
        System.out.println(false);
        return;

    }
    public static boolean chechCount(int[] count) {
        for(int i=0;i<26;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }
        return true;
        
    }
}
