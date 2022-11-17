public class studenAttendenceRecordI551 {
    public static void main(String[] args) {
        String s="LLPPALL";
        int A=0;
        int L=1;
        for(int i=1;i<s.length()&&s.length()>1;i++)
        {
            if(s.charAt(i-1)=='A')
            {
                A++;
            }
            if(s.charAt(i-1)=='L'&&s.charAt(i)=='L')
            {
                L++;
            }
            if(L==3)
            {
                 System.out.println(false);return;
            }
            if(s.charAt(i-1)=='L'&&s.charAt(i)!='L')
            {
                L=1;
            }
        }
        if(s.charAt(s.length()-1)=='A')
        {
            A++;
        }
       
        System.out.println(A<2 && L<3);
    }
}
