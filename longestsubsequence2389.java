import java.util.Arrays;

public class longestsubsequence2389 {
    public static void main(String[] args) {
        int arr[]= {4,5,2,1};
        int [] q={3,10,21};
        Arrays.sort(arr);
        int ans[] = new int[q.length];
        for(int i=1;i<arr.length;i++)
        {
           arr[i]=arr[i-1]+arr[i];z
        }
        for(int i=0;i<q.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]<=q[i])
                {
                    ans[i]=j+1;
                }
            }
        }
        for (int i : ans) {
            System.out.print(i+" ");
        }
        
    }
}
