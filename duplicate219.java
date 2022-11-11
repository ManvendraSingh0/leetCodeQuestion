public class duplicate219 {
    public static void main(String[] args) {
        int nums[] ={5,6,7,8,11,55,9,9};
        int k =3;
        System.out.println(checkdup(nums, k));
    }
    public static boolean checkdup(int [] nums,int k) {
        int i=1,j=0;
        while(i<nums.length || j<nums.length)
        {
            if(i-j<=k &&i<nums.length)
            {
                if(nums[i]==nums[j]&&i!=j)
                {
                    return true;
                }
                i++;
            }//time limit exceed in this solution
            else
            {
                j++;
                i=j;
                
            }
           
        }return false;
        
    }
}
