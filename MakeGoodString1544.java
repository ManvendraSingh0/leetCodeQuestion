import java.util.Stack;

public class MakeGoodString1544 {
    public static void main(String[] args) {
        String s="leEeetcode";
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty())
            {
                st.push(s.charAt(i));
            }
            else if(Math.abs(st.peek()-s.charAt(i))==32)
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        String s1="";
       while(!st.isEmpty())
       {
        s1=st.pop()+s1;
       }
        System.out.println(s1);
    }
}
