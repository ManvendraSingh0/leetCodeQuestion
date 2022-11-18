public class rainWater42 {
    public static void main(String[] args) {
        int [] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
    public static int trap(int[] arr) {
        int n = arr.length;
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        for (int i=0;i<n;i++){
            m1=Math.max(m1,arr[i]);
            m2=Math.max(m2,arr[n-1-i]);
            arr1[i]=m1;//find l-->r maximum;
            arr2[n-1-i]=m2;//find r-->l maximum;
        }
        int w=0;
        for (int i=0;i<n;i++){
            w+=Math.min(arr1[i],arr2[i])-arr[i];//choose the minimu from maximuss arrays the subtract original height to get water quantity;
            
        }
       
        // for(int i:arr1)
        // {
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // for(int i:arr2)
        // {
        //     System.out.print(i+" ");
        // }
    return w;
}
}
