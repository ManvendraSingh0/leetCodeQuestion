import java.util.ArrayList;
import java.util.List;

public class permutatiions46 {
    public static void main(String[] args) {
       int nums[] ={1,2,3};
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> ip=new ArrayList<>();
       boolean[] freq = new boolean[nums.length];
        printPermutation(nums,ip,ans,freq);
        System.out.println(ans);
    }
    public static void printPermutation(int[] nums,List<Integer> ip,List<List<Integer>> ans, boolean[] freq) {
        if(ip.size()==nums.length)
        {
           ans.add(new ArrayList<>(ip));
            return;
        }
        for( int i=0;i<nums.length;i++)
        { 
            if(!freq[i])
            {
                freq[i]= true;
                ip.add(nums[i]);
                printPermutation(nums,ip,ans,freq);
                ip.remove(ip.size()-1);
                freq[i]=false;

            }
        }
        }
    }