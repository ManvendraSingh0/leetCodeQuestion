public class jumpgame55 {
    public static void main(String[] args) {
        int nums[] ={2,3,1,1,4};
        System.out.println(canJump(nums));
        
    }
    
     public static boolean canJump(int[] nums) {
         int lp=nums.length-1;
         for(int i=lp-1;i>=0;i--)
         {
             if(nums[i]+i>=lp)
             {
                 lp=i;
             }
         }
         return lp==0;

        }
    
}
