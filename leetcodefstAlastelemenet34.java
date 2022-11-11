public class leetcodefstAlastelemenet34 {
    public static void main(String[] args) {
        int [] arr ={5,7,7,8,8,10};
        int t=8;
        int ei=arr.length-1,si=0;
        int fi=0,li=arr.length-1;
        while(si<ei)
        {
            if(arr[si]==t && arr[fi]!=t)
            {
                System.out.println(arr[si]+" "+si);
                fi=si;
            }
            if(arr[ei]==t && arr[li]!=t)
            {System.out.println(arr[ei]+" "+ei);
                    li=ei;
            }
            ei--;
            si++;

        }
        System.out.println(fi+" "+li);
    }
    
}
