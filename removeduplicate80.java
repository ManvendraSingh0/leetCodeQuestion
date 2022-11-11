public class removeduplicate80 {
    public static void main(String[] args) {
        int nums[]={1,1,1,1,2,2,3};
       int p= removeDuplicates(nums);
       System.err.println(p);
       for(int i:nums)
       {
        System.out.print(i+" ");
       }
    }
    public static int removeDuplicates(int[] nums) {
        int a=nums.length;
        if(a==0)
        {
            return 0;
        }
        int j=0;
        int c=1;
        for(int i=1;i<a;i++)
        {
            if(nums[j]!=nums[i] &&c>1)
            {
                j=j+2;
                nums[j]=nums[i];
                c=0;
            }
            else if(c==1 &&nums[j]!=nums[i]||c==1 &&nums[j]==nums[i]&&i==nums.length-1){
                j=j+1;
                nums[j]=nums[i];
                c=0;
            }
            c++;
        }return j+1;
        
    }
}
