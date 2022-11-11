import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode2 {
    public static void main(String[] args) {
        int [] a={-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> ans = new ArrayList<>();
       //int []p=twoSum(a, 6);
       Arrays.sort(a);
       for(int i=0;i<a.length;i++)
       {
        if(i==0||a[i-1]!=a[i])
        {
            threeSum(i+1,a.length-1,a,-a[i],ans);
        }
       }
       System.out.println(ans);
       
        
    }
    public static int[] threeSum(int i,int j,int[] a, int target, List<List<Integer>> ans) {
        int fe=a[i-1];
        while(i<j)
        {
           
            if(a[i]+a[j]>target)
            {
                j--;
            }
            else if(a[i]+a[j]<target)
            {
                i++;
            }
            else
            {
                List<Integer> l=new ArrayList();
                l.add(fe);
                l.add(a[i]);
                l.add(a[j]);
                ans.add(l);
                while(i<j && a[i]==a[i+1])
                {
                    i++;
                }
                while(i<j && a[j]==a[j-1])
                {
                    j-- ;
                }

                i++;
                j--;
            }
        }return a;
        }
}
