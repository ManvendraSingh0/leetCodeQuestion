import java.util.Stack;

public class dailyTemperature739 {
    public static void main(String[] args) {
        int arr[] ={30,60,90};
        int n = arr.length;
        int ans[] = new int [n];
        Stack<Integer>  st = new Stack();
        for( int i =0;i<n;i++)
        {
            while(!st.isEmpty()&&arr[i]>arr[st.peek()])
            {
                ans[st.peek()]= i-st.pop();
                // st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            ans[st.pop()]=0;
        }
        for(int i:ans)
        {
            System.out.print(i+" ");
        }

    }
}
