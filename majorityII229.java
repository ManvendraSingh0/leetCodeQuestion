import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class majorityII229 {
    public static void main(String[] args) {
        int nums[]={4,1,3,1,3,3,1,2,3,2,4,2,1,4,4,4,4,4};
        List<Integer> ans= new ArrayList<>();
        Arrays.sort(nums);
        int c1=nums.length/3;
        int c2=0;
        int p=nums[0];
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                c2=c2+1;;
            }
            else
            {
                if(c2>=c1)
                {
                    //c1=c2;
                    c2=0;
                    ans.add(nums[i-1]);
                }
                else c2=0;
            }
            
        }
        if(c2>=c1)
            {
                ans.add(nums[nums.length-1]);
            }
        System.out.println(ans);
    }
}
