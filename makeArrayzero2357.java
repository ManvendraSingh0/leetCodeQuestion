import java.util.Arrays;

public class makeArrayzero2357 {
    public static void main(String[] args) {
        int [] nums = {0};
        Arrays.sort(nums);
        int o=0;
        if(nums[0]>0)
        {
            o++;
        }
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                o++;
            }

        }
        System.out.println(o);
    }
}
