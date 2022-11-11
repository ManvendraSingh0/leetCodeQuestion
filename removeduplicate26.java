public class removeduplicate26 {
    public int removeDuplicates(int[] nums) {
        int a=nums.length;
        if(a==0)
        {
            return 0;
        }
        int j=0;
        for(int i=1;i<a;i++)
        {
            if(nums[j]!=nums[i])
            {
                j++;
                nums[j]=nums[i];
            }
        }return j+1;
        
    }
}
