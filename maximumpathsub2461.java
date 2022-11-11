import java.util.ArrayList;
import java.util.List;

public class maximumpathsub2461
{
    public static void main(String[] args) {
        int [] arr1= {1,5,4,2,9,9,9};
        List<Integer> list = new ArrayList<>();
        for(int i:arr1)
        {
            if(!list.contains(i))
            {
                list.add(i);
            }
        }
        int arr[]= new int[list.size()];
        int p=0;
        for(int i:list)
        {
           arr[p++]=i;
        }

        int k=3;
       System.out.println( MaximumSumofwindowsizek(arr,k));

    }
    public static int MaximumSumofwindowsizek(int[] arr, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {

			sum = sum + arr[i];
		}
		int ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];

			sum -= arr[i - k];
			ans = Math.max(ans, sum);

		}
		return ans;
}
}