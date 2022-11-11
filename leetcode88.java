import java.util.ArrayList;

public class leetcode88 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 5, 7,0, 9, 11,0,0 };

		int[] arr2 = { 1, 2, 3, 4, 6, 7 };
        System.out.println( MergeTwoArray(arr1, arr2));
		// int[] ans = MergeTwoArray(arr1, arr2);
		// for (int i = 0; i < ans.length; i++) {
		// 	System.out.print(ans[i] + " ");
		// }
	}
    public static ArrayList MergeTwoArray(int[] arr1, int[] arr2) {

		int i = 0;
		int j = 0;
		int k = 0;
		ArrayList<Integer> ans=new ArrayList<>();
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]&& arr1[i]!=0) {
				ans.add(arr1[i]);
				i++;
				//k++;
			}else if(arr1[i]==0){
                ans.add(arr2[j]);
				j++;

            }
            else if(arr2[i]==0){
                ans.add(arr1[i]);
				i++;
            }
             else  {
				ans.add(arr2[j]);
				j++;
				//k++;
			}
		}
		while (i < arr1.length && arr1[i]!=0) {
			ans.add(arr1[i]);
			i++;
			//k++;
		}
		while (j < arr2.length && arr2[j]!=0) {
			ans.add(arr2[j]);
			j++;
			//k++;
		}
		return ans;
	}
}
