public class applyoperation2460 {
    public static void main(String[] args) {
        int [] nums={1,2,2,1,1,0};
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                ans[j++]=nums[i];
            }
        }
        
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
    }
}
