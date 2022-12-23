import java.util.Stack;

public class keyboardrow500 {
    public static void main(String[] args) {
        String[] t={ " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
        String n="1203";
        Stack<Character> st = new Stack<>();
        for(int i=n.length()-1;i>=0;i--)
        {
            st.push(n.charAt(i));
        }
        System.out.println(st);
        // char [] in=n.toCharArray();
        String s1=t[(int)st.pop()-48];
           while(!st.isEmpty())
           {
            
            String s2=t[(int)st.pop()-48];
            
            for(int j=0;j<s1.length();j++)
            {
                for(int i=0;i<s2.length();i++)
                {
                    System.out.println(""+s1.charAt(j)+s2.charAt(i));
                }
            }
            s1=s2;
           }
           
            
        
    }
}
