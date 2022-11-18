public class SlidingWindoMaximu239 {
    public static void main(String[] args) {
        int [] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        int [] ans=new int[nums.length-k+1];
        int i=0;
        while(i<=nums.length-k)
        {
            int max = nums[i];
            int j=i;
            while(j<k+i)
            {
                
                max=Math.max(max,nums[j]);
                //i++;
                j++;
            }
            ans[i]=max;
            i++;
    
            
        }
        for(int p:ans)
        {
            System.out.print(p+" ");
        }
    }
}
