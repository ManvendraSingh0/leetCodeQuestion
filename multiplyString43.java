public class multiplyString43 {
    public static void main(String[] args) {
        String num1="123";
        String num2="456";
        int m =num1.length();
        int n=num2.length();
        if("0".equals(num1)||"0".equals(num1)) System.out.println("0");
        if("1".equals(num1)) System.out.println(num1);
        if("1".equals(num1)) System.out.println(num2);
        int ans[] = new int[m+n];
        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                int p= (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                p +=ans[i+j+1];
                ans[i+j+1]=p%10;
                ans[i+j]+=p/10;
            }
        }
            String s="";
            for(int i:ans)
            {
                System.out.print(i);
                if(s.length()==0 && i==0)
                {
                    continue;
                }
                s=s+i+"";
            }
        //    System.out.println(s);
    }
}
