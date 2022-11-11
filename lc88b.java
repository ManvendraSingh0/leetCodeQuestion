public class lc88b {
    
        //public static void main(String[] args) {
            public static void main(String[] args) {
                // TODO Auto-generated method stub
                int[] arr1 = { 3,2,3,4,0,0,0,0 };
                    
                int[] arr2 = { 1, 4, 6, 7 };
                int m=4;
                int n=4;
                int[] ans = MergeTwoArray(arr1, arr2,m,n);
                for (int i = 0; i < ans.length; i++) {
                    System.out.print(ans[i] + " ");
                }
            }
        
            public static int[] MergeTwoArray(int[] arr1, int[] arr2,int m,int n) {
        
                int i = m-1;
                int j = n-1;
                int k =m+n-1;
               // int[] ans = new int[arr1.length];
                while (k>=0) {
                    if(i>=0 && j>=0)
                    {
                        if (arr1[i] > arr2[j]) {
                            arr1[k] = arr1[i];
                            i--;
                            k--;
                        }
                        else{
                            arr1[k] = arr2[j];
                            j--;
                            k--;
                        }
                    }
                    
                    else if(i>=0) {
                        
                        
                        arr1[k] = arr1[i];
                       
                        //j++;
                        k--;
                        i--;
                    }
                    else
                    {
                        arr1[k] = arr2[j];
                       
                        //j++;
                        k--;
                        j--;
                    }
                }
               
                return arr1;
            }
    }

