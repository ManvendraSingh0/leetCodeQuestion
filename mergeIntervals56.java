import java.util.Arrays;

public class mergeIntervals56 {
    public static void main(String[] args) {
        int intrvl[][]={{1,4},{2,3}};
        Arrays.sort(intrvl, (a,b)-> Integer.compare(a[0],b[0]));
        int ans[][]=new int[intrvl.length][2];
        int i=1;
        int ind=0;
        int item =intrvl[0][0];
        int b=intrvl[0][1];
        while(i<intrvl.length)
        {
            if(intrvl[i][0]>b )
            {
                ans[ind][0]=item;
                ans[ind][1]=b;
                item=intrvl[i][0];
                b=intrvl[i][1];
                ind++;
            }
            else{
                b=Math.max(b,intrvl[i][1]);
            }i++;
        }
        ans[ind][0]=item;
        ans[ind][1]=b;
        int ans1[][]=new int[ind+1][2];
        for(int j=0;j<=ind;j++)
        {
            ans1[j][0]=ans[j][0];
            ans1[j][1]=ans[j][1];
        }
        for(int [] a:ans1)
        {
            for(int j:a)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
