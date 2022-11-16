import java.util.Stack;

public class rremoveDuplicate316 {
    public static void main(String[] args) {
        
        // System.out.println(st.contains(5));
        String s ="cbacdcb";
        Stack<Integer> st = new Stack<>();
        int[] li = new int[26];
        for (int i = 0; i < s.length(); i++){
            li[s.charAt(i) - 'a'] = i; // track the li of character presence
        }
        boolean[] visit=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            int c =s.charAt(i)-'a';
            if(visit[c]) continue;
            while(!st.empty()&& st.peek()>c && i<li[st.peek()] )
            {
                visit[st.pop()]=false;
            }
            st.push(c);
            visit[c]=true;
        }
        StringBuilder sb = new StringBuilder();
        while(st.size()>0)
        {
            sb.append((char)(st.pop()+'a'));
        }
        System.out.println(sb.reverse().toString());      
    }
}
