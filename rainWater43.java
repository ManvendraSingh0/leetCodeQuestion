import java.util.Scanner;

public class rainWater43 {
    public static void main(String args[]) {
		Scanner mine = new Scanner(System.in);
		int t = mine.nextInt();
		while(t-- > 0){
			int n = mine.nextInt();
			int [] arr = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = mine.nextInt();
			int m1=Integer.MIN_VALUE;
			int m2=Integer.MIN_VALUE;
			int [] arr1 = new int[n];
			int [] arr2 = new int[n];
			for (int i=0;i<n;i++){
				m1=Math.max(m1,arr[i]);
				m2=Math.max(m2,arr[n-1-i]);
				arr1[i]=m1;
				arr2[n-1-i]=m2;
			}
			int w=0;
			for (int i=0;i<n;i++){
				w+=Math.min(arr1[i],arr2[i])-arr[i];
			}
			System.out.println(w);
		}
    }
}
