import java.util.Arrays;

public class MinimuRoundComplete2244 {
    public static void main(String[] args) {
        int t[]={2,2,3,3,2,4,4,4,4,4};
        Arrays.sort(t);
        int c=1;
        int ans=0;
        for(int i=1;i<t.length;i++)
        {
            if(t[i-1]==t[i])
            {
                c++;
            }
            else
            {
                // System.out.println("c-->"+c);
                if(c<2)
                {
                    System.out.println(-1);
                    return;
                }
                else if(c==2)
                {
                    ans=ans+1;
                   
                }
                else if(c>=3)
                {
                    // System.out.println((int)Math.ceil((double)c/3));
                    ans=ans+(int)Math.ceil((double)c/3);
                
                }
                c=1;
            }
        }
        if(c>=3)
        {
            ans=ans+(int)Math.ceil((double)c/3);
        }
        else if(c==2)
        {
            ans= ans+1;
        }
        else if(c<2)
        {
            System.out.println(-1);
        }
        System.out.println(ans);
    }
}
