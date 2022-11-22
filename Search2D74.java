public class Search2D74 {
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        for(int i=0;i<arr.length;i++)
        {
            boolean p=binSearch(arr[i], 3);
            if(p==true)
            {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
        
    }
    public static boolean binSearch(int arr[],int item)
    {
        {
            int si=0;
            int ei=arr.length -1;
            while(si<=ei){
                int mid=(si+ei)/2;
            if(arr[mid]==item)
            {
                return true;
            }
            else if(arr[mid]>item)
            {
                ei=mid-1;
            }
            else
            {
                si=mid+1;
            }
        }
            return false;
        }
    }
}
