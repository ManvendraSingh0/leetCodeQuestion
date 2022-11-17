public class contaainsDuplicate220 {
    public static void main(String[] args) {
        int [] nums={1,5,9,1,5,9};
        int j=0,vd=0,id=4;
        for(int i=1;i<nums.length;i++)
        {
           // int j=i+id;
            if(Math.abs(nums[i]-nums[j])<=vd && Math.abs(i-j)<=id)
            {
                System.out.println("true");
                return;
            }
            else if(i==nums.length || Math.abs(i-j)==id)
            {
                i=++j;
            }
        }
        System.out.println("false");
    }
}
