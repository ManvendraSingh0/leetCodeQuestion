import java.util.Arrays;

public class majority169 {
    public static void main(String[] args) {
        int nums[]={2,3,3,3,4};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int c1=0;
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
                if(c2>c1)
                {
                    c1=c2;
                    c2=0;
                    p=nums[i-1];
                }
                // else
                

            }
        }
        System.out.println(c2+" "+c1);
        if(c2>c1)
        {
            return nums[nums.length-1];
        }
        else return p;
    }
}
