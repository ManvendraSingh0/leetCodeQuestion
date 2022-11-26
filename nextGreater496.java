import java.util.Stack;

public class nextGreater496 {
    public static void main(String[] args) {
         int [] arr={1,2,3,4};
        int n=arr.length;
        int [] arrs={2,4};
        int ans[]= new int[n];
        int ans1[]= new int[arrs.length];
        
       
        Stack<Integer> st=new Stack(); ///in this we put the  index of arrays element;
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()])
            {
                ans[st.pop()]=arr[i];
            }
        st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;  
    }
    for(int i=0;i<arrs.length;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(arrs[i]==arr[j])
            {
                ans1[i]=ans[j];
            }
        }
    }
    for(int i:ans1)
    {
        System.out.print(i+" ");
    }
}
}
