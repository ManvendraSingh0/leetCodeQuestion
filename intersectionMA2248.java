import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersectionMA2248 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int nums[][] = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
       // Arrays.sort(nums);
       int temp[]= new int[1001];
       for(int[] num:nums)
       {
        for(int e:num)
        {
            temp[e]++;
        }
       }
       for(int i=0;i<temp.length;i++)
       {
        if(temp[i]==nums.length)
        {
                arr.add(i);
        }
       }
       System.out.println(arr);
        
       
    }
}
