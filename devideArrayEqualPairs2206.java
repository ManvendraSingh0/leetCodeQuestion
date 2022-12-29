import java.util.Arrays;

class devideArrayEqualPairs2206
{
    public static void main(String[] args) {
        int [] nums={3,2,2,3,2,2};
        System.out.println(divideArray(nums));
    }
    public static boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]!=nums[1])
        {
            return false;
        }
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i-1]!=nums[i] && (i-1)%2==0)
            {
               return false;
            }
        }
        return true;
       }
}