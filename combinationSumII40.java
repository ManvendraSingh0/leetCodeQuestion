import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSumII40 {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ans1=new ArrayList<>();
		Combination(arr, target,ans,ans1, 0);
        System.out.println(ans);
    }
    public static void Combination(int[] arr, int target, List<List<Integer>> ans,  List<Integer> ans1,int idx) {
		
        if (target == 0) {
			//System.out.println(ans);
            ans.add(new ArrayList<>(ans1));
           
			return;
		}

		for (int i = idx; i < arr.length; i++) {
			if (i != idx && arr[i] == arr[i - 1]) {
				continue;
			}

			if (target >= arr[i]) {
                ans1.add(arr[i]);
				Combination(arr, target - arr[i], ans,ans1, i + 1);
                ans1.remove(ans1.size()-1);
			}

		}
	}
}
