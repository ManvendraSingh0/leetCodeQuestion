import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class intersection {
    public static void main(String[] args) {
        String w[] ={"bella","label","roller"};
        Arrays.sort(w);
        char [] ca =w[0].toCharArray();
        Arrays.sort(ca);
       int k=0;
        for(int s=1;s<w.length;s++)
        {
             int i=0,j=0;k=0;
            char [] cp =w[s].toCharArray();
            Arrays.sort(cp);
            while(i<ca.length && j<cp.length)
            {
             if(ca[i]==cp[j])
             {
                 ca[k++]=ca[i];
                 i++;j++;
             }
             else if(ca[i]>cp[j]) j++;
             else i++;
            }
        }
        List<String> ans= new ArrayList<>();
        for(int z=0;z<k;z++)
        {
            ans.add(ca[z]+"");
        }
        System.out.println(ans);
        // int num1 [] ={1,2,2,1};
        // int num2[] ={2,2};
        // Set<Integer> a = new HashSet<Integer>();
        // Set<Integer> b = new HashSet<Integer>();
        // a.addAll(Arrays.stream(num1).boxed().toList());
        // b.addAll(Arrays.stream(num2).boxed().toList());
        // Set<Integer> c = new HashSet<Integer>(a);
        // c.retainAll(b);
        // c.removeAll(c);
        // System.out.println(c);
        // int ans[] =new int[c.size()];
        // int p=0;
        // for(int i:c)
        // {
        //     ans[p++]=i;
        // }

    }
}
