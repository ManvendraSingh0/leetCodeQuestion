public class BinarySearch704 {
    public static void main(String[] args) {
        int nums[]={-1,0,3,5,9,12};
        int target=9;
       System.out.println( Searchnum(nums, target));
    }
    public static int Searchnum(int[] arr,int te)
    {
        int si=0,li=arr.length-1;
       
        while(si<=li)
        {
            int mi=(si+li)/2;
        if(arr[mi]==te)
        {
            return mi;
        }
        else if(arr[mi]>te)
        {
            li=mi-1;
        }
        else if(arr[mi]<te)
        {
            si=mi+1;
        }
        }
      return -1;
    }
}
