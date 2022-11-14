public class FiandLi34 {
    public static void main(String[] args) {
        int te=8;
        int arr[]= {5,7,7,8,8,10};
        int fi=binarySearch(arr,te,true);
        int li=binarySearch(arr,te,false);
         int[] arr1= {fi,li};
         for(int i:arr1)
         {
            System.err.print(i+" ");
         }
    }
    public static int binarySearch(int[] arr, int te, boolean lbias) {
        
        int l = 0;
        int r = arr.length - 1;
        
        int i = -1;
        
        while(l <= r) {
            int mid = l + (r - l) / 2;
            
            if(te > arr[mid]) {
                l = mid + 1;
            } 
            else if (te < arr[mid]) {
                r = mid - 1;
            } 
            else {
                i = mid;
                if(lbias) {
                    r = mid - 1;  
                }
                else {
                    l = mid + 1;
                }
            }
        }
        return i;
    }
}
