public class lc88 {
    //public static void main(String[] args) {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int[] arr1 = { 3,2,3,4,0,0,0,0 };
                
            int[] arr2 = { 1, 4, 6, 7 };
            int[] ans = MergeTwoArray(arr1, arr2);
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            }
        }
    
        public static int[] MergeTwoArray(int[] arr1, int[] arr2) {
    
            int i = 0;
            int j = 0;
            int k = 0;
           // int[] ans = new int[arr1.length];
            while (i < arr1.length) {
                if (arr1[i] <= arr2[j]&&arr1[i]!=0) {
                    arr1[k] = arr1[i];
                    i++;
                    k++;
                }
                
                else if(arr1[i]>arr2[j]) {
                    int temp=arr1[i];
                    
                    arr1[k] = arr2[j];
                    arr2[j]=temp;
                    //j++;
                    k++;
                    i++;
                }
            }
            while (i < arr1.length && arr1[i]==0) {
                arr1[k] = arr2[j];
                i++;
                k++;
                j++;
            }
            return arr1;
        }
}