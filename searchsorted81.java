public class searchsorted81 {
    public static void main(String[] args) {
        int [] nums={4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }
    public static boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]==target)
             {
                 return true;
             }
        }
         return false;
     }
}
