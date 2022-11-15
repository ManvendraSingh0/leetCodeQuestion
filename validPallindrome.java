public class validPallindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        sb = sb.reverse();
        String s1= String.valueOf(sb);
        System.out.println(s1.equals(s));
    }
}
