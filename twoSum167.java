import java.util.ArrayList;
import java.util.List;

public class twoSum167 {
    public static void main(String[] args) {
        int arr[] = {-1,0};
        int ans[]=new int[2];
        int te=-1;
        TwoSum(arr,ans,te);
       for(int i:ans)
       {
        System.out.print(i+" ");
       }


    }
    public static void TwoSum(int arr[], int []ans,int te) {
        int fi=0;
        int li=arr.length-1;
        while(fi<li)
        {
            if(arr[fi]+arr[li]==te)
            {
               ans[0]=fi+1;
               ans[1]=li+1;
                return;
            }
            else if(arr[fi]+arr[li]>te)
            {
                li--;
            }
            else if(arr[fi]+arr[li]<te)
            {
                fi++;
            }
        }
        
    }

}
